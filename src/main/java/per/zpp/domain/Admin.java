package per.zpp.domain;

public class Admin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_admin.a_id
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    private Integer aId;

    @Override
    public String toString() {
        return "Admin{" +
                "aId=" + aId +
                ", aUsername='" + aUsername + '\'' +
                ", aPassword='" + aPassword + '\'' +
                ", aName='" + aName + '\'' +
                ", aPhone=" + aPhone +
                ", aPower='" + aPower + '\'' +
                ", aDescribe='" + aDescribe + '\'' +
                '}';
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_admin.a_username
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    private String aUsername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_admin.a_password
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    private String aPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_admin.a_name
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    private String aName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_admin.a_phone
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    private Long aPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_admin.a_power
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    private String aPower;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_admin.a_describe
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    private String aDescribe;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table d_admin
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public Admin(Integer aId, String aUsername, String aPassword, String aName, Long aPhone, String aPower, String aDescribe) {
        this.aId = aId;
        this.aUsername = aUsername;
        this.aPassword = aPassword;
        this.aName = aName;
        this.aPhone = aPhone;
        this.aPower = aPower;
        this.aDescribe = aDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table d_admin
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public Admin() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_admin.a_id
     *
     * @return the value of d_admin.a_id
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public Integer getaId() {
        return aId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_admin.a_id
     *
     * @param aId the value for d_admin.a_id
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public void setaId(Integer aId) {
        this.aId = aId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_admin.a_username
     *
     * @return the value of d_admin.a_username
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public String getaUsername() {
        return aUsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_admin.a_username
     *
     * @param aUsername the value for d_admin.a_username
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public void setaUsername(String aUsername) {
        this.aUsername = aUsername == null ? null : aUsername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_admin.a_password
     *
     * @return the value of d_admin.a_password
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public String getaPassword() {
        return aPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_admin.a_password
     *
     * @param aPassword the value for d_admin.a_password
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public void setaPassword(String aPassword) {
        this.aPassword = aPassword == null ? null : aPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_admin.a_name
     *
     * @return the value of d_admin.a_name
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public String getaName() {
        return aName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_admin.a_name
     *
     * @param aName the value for d_admin.a_name
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_admin.a_phone
     *
     * @return the value of d_admin.a_phone
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public Long getaPhone() {
        return aPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_admin.a_phone
     *
     * @param aPhone the value for d_admin.a_phone
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public void setaPhone(Long aPhone) {
        this.aPhone = aPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_admin.a_power
     *
     * @return the value of d_admin.a_power
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public String getaPower() {
        return aPower;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_admin.a_power
     *
     * @param aPower the value for d_admin.a_power
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public void setaPower(String aPower) {
        this.aPower = aPower == null ? null : aPower.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_admin.a_describe
     *
     * @return the value of d_admin.a_describe
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public String getaDescribe() {
        return aDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_admin.a_describe
     *
     * @param aDescribe the value for d_admin.a_describe
     *
     * @mbggenerated Thu Aug 24 08:59:59 CST 2023
     */
    public void setaDescribe(String aDescribe) {
        this.aDescribe = aDescribe == null ? null : aDescribe.trim();
    }
}