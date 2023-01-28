package com.Mes.model;

import java.util.List;

public class MesService {
	private MesDAO_interface dao;

	public MesService() {
		dao = new MesJDBCDAO();
	}

	public MesVO addMesVO(Integer userId, String sendTitle,String sendContent,byte[] sendPic, java.sql.Timestamp sendTime, Boolean readMesseng) {
		MesVO mesVO = new MesVO();
		mesVO.setMesId(userId);
		mesVO.setSendTitle(sendTitle);
		mesVO.setSendContent(sendContent);
		mesVO.setSendPic(sendPic);
		mesVO.setSendTime(sendTime);
		mesVO.setReadMesseng(readMesseng);
		return mesVO;
	}

	public MesVO updateMesVO(Integer userId,  String sendTitle, String sendContent,byte[] sendPic,java.sql.Timestamp sendTime, Boolean readMesseng,
			Integer mesId) {
		MesVO mesVO = new MesVO();
		mesVO.setMesId(userId);
		mesVO.setSendTitle(sendTitle);
		mesVO.setSendContent(sendContent);
		mesVO.setSendPic(sendPic);
		mesVO.setSendTime(sendTime);
		mesVO.setReadMesseng(readMesseng);
		mesVO.setMesId(mesId);
		return mesVO;
	}

	public void deleteMes(Integer userId) {
		dao.delete(userId);
	}

	public MesVO getOneMesVO(Integer userId) {
		return dao.findByPrimaryKey(userId);
	}

	public List<MesVO> getAll(Integer userId) {
		return dao.getAll();
	}
}
