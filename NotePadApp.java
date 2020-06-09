package site.itwill.io;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.activation.FileDataSource;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

//텍스트 파일 편집기 프로그램 - 메모장
public class NotePadApp extends JFrame implements ActionListener {
	/**
	 * Jframe에는 시리얼번호가 없기 때문에 자식클래스(NotePadApp)에서 대신 시리얼넘버를 갖게한다
	 */
	private static final long serialVersionUID = 1L;

	private JMenuItem init, open, save, exit;
	private JTextArea area;
	private FileDialog openDialog, saveDialog;

	// 현재 작업중인 파일의 경로를 저장하기 위한 필드
	private String filePath;

	// JTextArea컴포넌트의 내용변경 상태를 저장하기 위한 필드
	// => false(default) : 변경되지 않은 상태, true : 변경을 한 상태
	private boolean state;

	public NotePadApp(String title) {
		super(title);

		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("파일(F)");
		menu.setMnemonic('F');
		init = new JMenuItem("새로만들기(N)", 'N');
		open = new JMenuItem("열기(D)", 'D');
		save = new JMenuItem("저장(S)", 'S');
		exit = new JMenuItem("끝내기(X)", 'X');

		init.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));

		menu.add(init);
		menu.add(open);
		menu.add(save);

		menu.addSeparator();

		menu.add(exit);

		bar.add(menu);
		setJMenuBar(bar);

		area = new JTextArea();
		area.setFont(new Font("굴림", Font.PLAIN, 16));
		JScrollPane pane = new JScrollPane(area);
		getContentPane().add(pane, BorderLayout.CENTER);

		openDialog = new FileDialog(this, "열기", FileDialog.LOAD);
		saveDialog = new FileDialog(this, "저장", FileDialog.SAVE);

		init.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);

		// JTextArea컴퍼넌트에서 키보드 이벤트가 발생된 경우 이벤트 핸들러 등록
		// => 이벤트 핸들러를 anonymous inner타입으로 만들어준다.
		area.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				// 이벤트 발생 키보드의 문자값이 null문자가 아닌경우
				if (e.getKeyChar() != '\0') {
					state = true;// 편집된 상태
				}

			}
		});
		

		//프레임에서 종료버튼을 누른 경우 실행될 이벤트 핸들러 등록
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if(!saveConfirm()) return;
				System.exit(0);
			}
		});
		
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//일단 안닫히게 만들어주고, 윈도우 어댑터를 이용하여 이벤트 등록을 따로 해준다.

		setBounds(150, 50, 1000, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NotePadApp("제목없음 - Java 메모장");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object eventSource = e.getSource();

		if (eventSource == init) {
			if (saveConfirm()) {
				// JtextArea 초기화
				area.setText("");
				// 파일경로 초기화
				filePath = "";
				// 프레임 제목 초기화
				setTitle("제목없음 - Java 메모장");
			}

		} else if (eventSource == open) {
			if (!saveConfirm())
				return;

			// 열기관련 파일 다이얼로그 컴포넌트를 화면에 출력
			// => 파일을 선택하거나 취소를 선택하는 경우에만 파일 다이얼로그 컴포넌트는 자동으로 숨겨진다.
			// => FileDialog.getDirectory() : 선택파일이 존재하는 디렉토리 경로를 반환하는 메소드
			// => FileDialog.getFile() : 선택파일명을 반환하는 메소드
			openDialog.setVisible(true);

			// FileDialog컴포넌트에서 취소를 선택한 경우 메소드 걍 종료
			if (openDialog.getFile() == null || openDialog.getDirectory() == null) {// 파일 선택하지 않는 경우
				return;
			}

			// 선택파일의 경로를 반환받아 저장
			filePath = openDialog.getDirectory() + openDialog.getFile();
			setTitle(openDialog.getFile() + "- Java 메모장");

			// JTextARea 컴포넌트를 초기화
			area.setText("");

			// 파일 입력스트림을 생성하여 저장 => 메모장은 문자데이터를 읽어들이고 저장하는것이기때문에
			// 파일리더를 사용하는 것이 낫다
			// 한번에 많은 문자를 읽어들이고, 다양항 메소드를 사용하기 위해서 더 확장시킨다 - BufferedReader
			// <=> FileReader는 한문자씩 읽어들이기 때문.

			try {

				BufferedReader in = new BufferedReader(new FileReader(filePath));

				// 프레임의 제목 변경
				setTitle(openDialog.getFile() + " - Java 메모장");

				// 파일에 저장된 내용을 읽어 JTextArea컴포넌트에 출력시킨다.
				// => 한줄씩 읽어 Jtext 컴포넌트에 추가하는 작업을 해야한다. -> 반복처리
				while (true) {
					// 파일입력스트림을 이용하여 ★Enter전까지★ 문자들을 읽어 문자열로 반환받아 저장할 수 있도록 한다.
					String text = in.readLine();

					if (text == null)
						break;
					area.append(text + "\n");// 엔터까지 입력받아야함
				}
				in.close();

			} catch (FileNotFoundException e1) {
				JOptionPane.showMessageDialog(this, "선택한 파일이 존재하지 않습니다.", "에러", JOptionPane.ERROR_MESSAGE);
			} catch (IOException e2) {
				JOptionPane.showMessageDialog(this, "프로그램에 문제가 발생하였습니다.", "에러", JOptionPane.ERROR_MESSAGE);

			}

		} else if (eventSource == save) {
			if (filePath == null) {// 작업파일이 없을때만 실행해라 ->이미 있는 것에 덮어씌우려면 다이얼로그 띄우지말고 넘어가기 위해서

				// 저장관련 파일 다이얼로그 컴포넌트를 화면에 출력
				saveDialog.setVisible(true);

				if (saveDialog.getFile() == null)
					return;

				filePath = saveDialog.getDirectory() + saveDialog.getFile();
				setTitle(saveDialog.getFile() + " - Java 메모장");// 선택된 파일로 이름 변경
			}

			try {
				// 파일 출력스트림을 확장생성하여 저장
				BufferedWriter out = new BufferedWriter(new FileWriter(filePath));

				// JtextArea 컴퍼넌트의 모든 문자열을 반환받아 저장
				String text = area.getText(); // getText() : 모든 문자열을(엔터포함) 다 읽어 들일 수 있음

				// 파일 출력스트림으로 문자열을 전달하여 저장
				out.write(text);

				out.close();

			} catch (IOException e1) {
				JOptionPane.showMessageDialog(this, "프로그램에 문제가 발생하였습니다.", "에러", JOptionPane.ERROR_MESSAGE);
			}

		} else if (eventSource == exit) {
			if (!saveConfirm())
				return;

			System.exit(0);

		}

	}

	// JtextArea 컴포넌트의 내용변경에 대한 저장유무를 선택처리하기 위한 메소드
	// => 반환값이 false : 취소, true : 저장/미저장을 선택
	// =>프레임이 종료한 경우에도 호출되도록 한다.
	public boolean saveConfirm() {
		// JTextArea컴포넌트의 내용이 변경된 경우
		if (state) {
			// JOptionPane.showConfirmDialog(component parents, object message, String
			// title, int operation)
			// => 선택 다이얼로그를 출력하는 메소드, 선택 결과값을 정수형으로 반환한다.
			int choice = JOptionPane.showConfirmDialog(this, "변경된 내용을 저장하시겠습니까?", "확인",
					JOptionPane.YES_NO_CANCEL_OPTION);

			if (choice == JOptionPane.YES_OPTION) {// 예(저장)을 선택한 경우
				if (filePath == null) {// 작업파일이 없을때만 실행해라 ->이미 있는 것에 덮어씌우려면 다이얼로그 띄우지말고 넘어가기 위해서

					// 저장관련 파일 다이얼로그 컴포넌트를 화면에 출력
					saveDialog.setVisible(true);

					if (saveDialog.getFile() == null)
						return false;

					filePath = saveDialog.getDirectory() + saveDialog.getFile();
					setTitle(saveDialog.getFile() + " - Java 메모장");// 선택된 파일로 이름 변경
				}

				try {
					// 파일 출력스트림을 확장생성하여 저장
					BufferedWriter out = new BufferedWriter(new FileWriter(filePath));

					// JtextArea 컴퍼넌트의 모든 문자열을 반환받아 저장
					String text = area.getText(); // getText() : 모든 문자열을(엔터포함) 다 읽어 들일 수 있음

					// 파일 출력스트림으로 문자열을 전달하여 저장
					out.write(text);

					out.close();

				} catch (IOException e1) {
					JOptionPane.showMessageDialog(this, "프로그램에 문제가 발생하였습니다.", "에러", JOptionPane.ERROR_MESSAGE);
				}

			} else if (choice == JOptionPane.CANCEL_OPTION || choice == JOptionPane.CLOSED_OPTION) {// 아니오(취소)를 선택한 경우
				return false;
			}
		}

		// 저장, 미저장을 선택하면 true를 반환
		state = false; // 변경상태 초기화
		return true;
	}
}
