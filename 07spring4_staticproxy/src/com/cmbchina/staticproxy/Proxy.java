package com.cmbchina.staticproxy;

public class Proxy implements Rent{
	private Host host;
	public Proxy() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public Proxy(Host host) {
		super();
		this.host = host;
	}
	public void setHost(Host host) {
		this.host = host;
	}
	//�ⷿ
	public void rent(){
		seeHouse();
		host.rent();
		fare();
	}
	//����
	private void seeHouse(){
		System.out.println("�����Ϳ���");
	}
	//���н��
	private void fare() {
		System.out.println("��ȡ�н��");
	}
	
}