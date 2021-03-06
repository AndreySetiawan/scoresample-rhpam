package id.co.muf.score_sample;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DataPemohon implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Nama Pemohon")
	private java.lang.String nama;
	@org.kie.api.definition.type.Label("Lama Bekerja")
	private java.lang.Integer lamaKerja;
	@org.kie.api.definition.type.Label("Tenor Kredit")
	private int tenorKredit;

	@org.kie.api.definition.type.Label("Skor Lama Kerja")
	private double skorLamaKerja;

	@org.kie.api.definition.type.Label("Skorn Tenor Portfolio")
	private double skorTenorPortfolio;

	@org.kie.api.definition.type.Label("Portfolio")
	private String portfolio;

	@org.kie.api.definition.type.Label("Usia Pemohon")
	private java.lang.Integer usiaPemohon;

	@org.kie.api.definition.type.Label("Skor Akhir")
	private double skorAkhir;

	@org.kie.api.definition.type.Label("LTV")
	private double ltv;

	@org.kie.api.definition.type.Label("Skor LTV")
	private double skorLTV;

	@org.kie.api.definition.type.Label(value = "Jenis Pembiayaan")
	private int jenisPembiayaan;

	public DataPemohon() {
	}

	public java.lang.String getNama() {
		return this.nama;
	}

	public void setNama(java.lang.String nama) {
		this.nama = nama;
	}

	public java.lang.Integer getLamaKerja() {
		return this.lamaKerja;
	}

	public void setLamaKerja(java.lang.Integer lamaKerja) {
		this.lamaKerja = lamaKerja;
	}

	public int getTenorKredit() {
		return this.tenorKredit;
	}

	public void setTenorKredit(int tenorKredit) {
		this.tenorKredit = tenorKredit;
	}

	public double getSkorLamaKerja() {
		return this.skorLamaKerja;
	}

	public void setSkorLamaKerja(double skorLamaKerja) {
		this.skorLamaKerja = skorLamaKerja;
	}

	public double getSkorTenorPortfolio() {
		return this.skorTenorPortfolio;
	}

	public void setSkorTenorPortfolio(double skorTenorPortfolio) {
		this.skorTenorPortfolio = skorTenorPortfolio;
	}

	public java.lang.Integer getUsiaPemohon() {
		return this.usiaPemohon;
	}

	public void setUsiaPemohon(java.lang.Integer usiaPemohon) {
		this.usiaPemohon = usiaPemohon;
	}

	public java.lang.String getPortfolio() {
		return this.portfolio;
	}

	public void setPortfolio(java.lang.String portfolio) {
		this.portfolio = portfolio;
	}

	public double getSkorAkhir() {
		return this.skorAkhir;
	}

	public void setSkorAkhir(double skorAkhir) {
		this.skorAkhir = skorAkhir;
	}

	public double getLtv() {
		return this.ltv;
	}

	public void setLtv(double ltv) {
		this.ltv = ltv;
	}

	public double getSkorLTV() {
		return this.skorLTV;
	}

	public void setSkorLTV(double skorLTV) {
		this.skorLTV = skorLTV;
	}

	public int getJenisPembiayaan() {
		return this.jenisPembiayaan;
	}

	public void setJenisPembiayaan(int jenisPembiayaan) {
		this.jenisPembiayaan = jenisPembiayaan;
	}

	public DataPemohon(java.lang.String nama, java.lang.Integer lamaKerja,
			int tenorKredit, double skorLamaKerja, double skorTenorPortfolio,
			java.lang.String portfolio, java.lang.Integer usiaPemohon,
			double skorAkhir, double ltv, double skorLTV, int jenisPembiayaan) {
		this.nama = nama;
		this.lamaKerja = lamaKerja;
		this.tenorKredit = tenorKredit;
		this.skorLamaKerja = skorLamaKerja;
		this.skorTenorPortfolio = skorTenorPortfolio;
		this.portfolio = portfolio;
		this.usiaPemohon = usiaPemohon;
		this.skorAkhir = skorAkhir;
		this.ltv = ltv;
		this.skorLTV = skorLTV;
		this.jenisPembiayaan = jenisPembiayaan;
	}

}