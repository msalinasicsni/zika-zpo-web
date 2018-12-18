package ni.org.ics.zpo.domain;

import ni.org.ics.zpo.domain.audit.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by ics.
 */
@Entity
@Table(name = "zpo04_extended_section_a_to_f", catalog = "zika_zpo")
public class Zpo04ExtendedSectionAtoF extends BaseMetaData implements Auditable {

    private static final long serialVersionUID = 1L;
    private String recordId;
    private String eventName;
    private Date triDov;
    private String triPrimJobInd;
    private String triPrimJobHours;
    private String triHouseSitInd;
    private String triCity;
    private String triState;
    private String triCountry;
    private String triResidRef;
    private String triCurrResidDurRef;
    private String triCurrResidDur;
    private String triNbhoodTyp;
    private String triResidTyp;
    private String triResidTypSpecify;
    private String triFloorMat;
    private String triFloorMatSpecify;
    private String triWallMat;
    private String triWallMatSpecify;
    private String triRoofMat;
    private String triRoofMatSpecify;
    private String triTrashDispos;
    private String triTrashDisposSpecify;
    private Integer triNumTotalRooms;
    private Integer triNumSleepRooms;
    private Integer triNumPeople;
    private String triScreensInd;
    private String triHouseAmenities;//multiple
    private String triTransAccess;//multiple
    private String triPrimWaterSrc;
    private String triWaterContainInd;
    private String triWaterContainTyp;
    private String triWaterConSpecify;
    private String triWaterTreatHome;
    private String triWaterTreatFreq;
    private String triToiletTyp;
    private String triOpSewageInd;
    private String triAnimalsInd;
    private String triAnimalTyp;//multiple
    private String triAnimalSpecify;
    private Integer triNumOtherAnimal;
    private Integer triNumCattle;
    private Integer triNumPig;
    private Integer triNumFowl;
    private Integer triNumGoatsSheep;
    private String triSmokeInd;
    private String triDrinkInd;
    private String triDrinkEverInd;
    private String triBugNuisInd;
    private String triPestStorHomeInd;
    private String triPestAppHomeInd;
    private String triPestAppDay;
    private String triPestAppMonth;
    private String triPestAppYear;
    private String triPestAppName;
    private String triHomeTrtdInsctInd;
    private String triHomeTrtdLoc;
    private String triHomeTrtdEntity;
    private String triHomeTrtdNames;
    private String triTrtmntAppDay;
    private String triTrtmntAppMonth;
    private String triTrtmntAppYear;
    private String triLwnTrtmntAppInd;
    private String triLwnTrtmntAppDay;
    private String triLwnTrtmntAppMonth;
    private String triLwnTrtmntAppYear;
    private String triLwnTrtmntAppName;
    private String triMosqRepInd;
    private String triMosqRepTyp;
    private String triMosqRepNameSpray;
    private String triMosqRepDkSpray;
    private String triMosqRepNameLotion;
    private String triMosqRepDkLotion;
    private String triMosqRepNameSpiral;
    private String triMosqRepDkSpiral;
    private String triMosqRepNamePlugin;
    private String triMosqRepDkPlugin;
    private String triMosqRepNameOther;
    private String triMosqRepDkOther;
    private String triCompId;
    private Date triCompDat;
    private String triRevId;
    private Date triRevDat;
    private String triEntId;
    private Date triEntDat;

    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Id
    @Column(name = "event_name", length = 100)
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Column(name = "tri_dov")
    public Date getTriDov() {
        return triDov;
    }

    public void setTriDov(Date triDov) {
        this.triDov = triDov;
    }

    @Column(name = "tri_prim_job_ind", length = 1)
    public String getTriPrimJobInd() {
        return triPrimJobInd;
    }

    public void setTriPrimJobInd(String triPrimJobInd) {
        this.triPrimJobInd = triPrimJobInd;
    }

    @Column(name = "tri_prim_job_hours", length = 4)
    public String getTriPrimJobHours() {
        return triPrimJobHours;
    }

    public void setTriPrimJobHours(String triPrimJobHours) {
        this.triPrimJobHours = triPrimJobHours;
    }

    @Column(name = "tri_house_sit_ind", length = 1)
    public String getTriHouseSitInd() {
        return triHouseSitInd;
    }

    public void setTriHouseSitInd(String triHouseSitInd) {
        this.triHouseSitInd = triHouseSitInd;
    }

    @Column(name = "tri_city", length = 100)
    public String getTriCity() {
        return triCity;
    }

    public void setTriCity(String triCity) {
        this.triCity = triCity;
    }

    @Column(name = "tri_state", length = 50)
    public String getTriState() {
        return triState;
    }

    public void setTriState(String triState) {
        this.triState = triState;
    }

    @Column(name = "tri_country", length = 50)
    public String getTriCountry() {
        return triCountry;
    }

    public void setTriCountry(String triCountry) {
        this.triCountry = triCountry;
    }

    @Column(name = "tri_resid_ref", length = 1)
    public String getTriResidRef() {
        return triResidRef;
    }

    public void setTriResidRef(String triResidRef) {
        this.triResidRef = triResidRef;
    }

    @Column(name = "tri_curr_resid_dur", length = 4)
    public String getTriCurrResidDur() {
        return triCurrResidDur;
    }

    public void setTriCurrResidDur(String triCurrResidDur) {
        this.triCurrResidDur = triCurrResidDur;
    }

    @Column(name = "tri_curr_resid_dur_ref", length = 1)
    public String getTriCurrResidDurRef() {
        return triCurrResidDurRef;
    }

    public void setTriCurrResidDurRef(String triCurrResidDurRef) {
        this.triCurrResidDurRef = triCurrResidDurRef;
    }

    @Column(name = "tri_nbhood_typ", length = 1)
    public String getTriNbhoodTyp() {
        return triNbhoodTyp;
    }

    public void setTriNbhoodTyp(String triNbhoodTyp) {
        this.triNbhoodTyp = triNbhoodTyp;
    }

    @Column(name = "tri_resid_typ", length = 2)
    public String getTriResidTyp() {
        return triResidTyp;
    }

    public void setTriResidTyp(String triResidTyp) {
        this.triResidTyp = triResidTyp;
    }

    @Column(name = "tri_resid_typ_specify")
    public String getTriResidTypSpecify() {
        return triResidTypSpecify;
    }

    public void setTriResidTypSpecify(String triResidTypSpecify) {
        this.triResidTypSpecify = triResidTypSpecify;
    }

    @Column(name = "tri_floor_mat", length = 2)
    public String getTriFloorMat() {
        return triFloorMat;
    }

    public void setTriFloorMat(String triFloorMat) {
        this.triFloorMat = triFloorMat;
    }

    @Column(name = "tri_floor_mat_specify")
    public String getTriFloorMatSpecify() {
        return triFloorMatSpecify;
    }

    public void setTriFloorMatSpecify(String triFloorMatSpecify) {
        this.triFloorMatSpecify = triFloorMatSpecify;
    }

    @Column(name = "tri_wall_mat", length = 2)
    public String getTriWallMat() {
        return triWallMat;
    }

    public void setTriWallMat(String triWallMat) {
        this.triWallMat = triWallMat;
    }

    @Column(name = "tri_wall_mat_specify")
    public String getTriWallMatSpecify() {
        return triWallMatSpecify;
    }

    public void setTriWallMatSpecify(String triWallMatSpecify) {
        this.triWallMatSpecify = triWallMatSpecify;
    }

    @Column(name = "tri_roof_mat", length = 2)
    public String getTriRoofMat() {
        return triRoofMat;
    }

    public void setTriRoofMat(String triRoofMat) {
        this.triRoofMat = triRoofMat;
    }

    @Column(name = "tri_roof_mat_specify")
    public String getTriRoofMatSpecify() {
        return triRoofMatSpecify;
    }

    public void setTriRoofMatSpecify(String triRoofMatSpecify) {
        this.triRoofMatSpecify = triRoofMatSpecify;
    }

    @Column(name = "tri_trash_dispos", length = 2)
    public String getTriTrashDispos() {
        return triTrashDispos;
    }

    public void setTriTrashDispos(String triTrashDispos) {
        this.triTrashDispos = triTrashDispos;
    }

    @Column(name = "tri_trash_dispos_specify")
    public String getTriTrashDisposSpecify() {
        return triTrashDisposSpecify;
    }

    public void setTriTrashDisposSpecify(String triTrashDisposSpecify) {
        this.triTrashDisposSpecify = triTrashDisposSpecify;
    }

    @Column(name = "tri_num_total_rooms")
    public Integer getTriNumTotalRooms() {
        return triNumTotalRooms;
    }

    public void setTriNumTotalRooms(Integer triNumTotalRooms) {
        this.triNumTotalRooms = triNumTotalRooms;
    }

    @Column(name = "tri_num_sleep_rooms")
    public Integer getTriNumSleepRooms() {
        return triNumSleepRooms;
    }

    public void setTriNumSleepRooms(Integer triNumSleepRooms) {
        this.triNumSleepRooms = triNumSleepRooms;
    }

    @Column(name = "tri_num_people")
    public Integer getTriNumPeople() {
        return triNumPeople;
    }

    public void setTriNumPeople(Integer triNumPeople) {
        this.triNumPeople = triNumPeople;
    }

    @Column(name = "tri_screens_ind", length = 1)
    public String getTriScreensInd() {
        return triScreensInd;
    }

    public void setTriScreensInd(String triScreensInd) {
        this.triScreensInd = triScreensInd;
    }

    @Column(name = "tri_house_amenities", length = 25)
    public String getTriHouseAmenities() {
        return triHouseAmenities;
    }

    public void setTriHouseAmenities(String triHouseAmenities) {
        this.triHouseAmenities = triHouseAmenities;
    }

    @Column(name = "tri_trans_access", length = 25)
    public String getTriTransAccess() {
        return triTransAccess;
    }

    public void setTriTransAccess(String triTransAccess) {
        this.triTransAccess = triTransAccess;
    }

    @Column(name = "tri_prim_water_src", length = 2)
    public String getTriPrimWaterSrc() {
        return triPrimWaterSrc;
    }

    public void setTriPrimWaterSrc(String triPrimWaterSrc) {
        this.triPrimWaterSrc = triPrimWaterSrc;
    }

    @Column(name = "tri_water_contain_ind", length = 1)
    public String getTriWaterContainInd() {
        return triWaterContainInd;
    }

    public void setTriWaterContainInd(String triWaterContainInd) {
        this.triWaterContainInd = triWaterContainInd;
    }

    @Column(name = "tri_water_contain_typ", length = 2)
    public String getTriWaterContainTyp() {
        return triWaterContainTyp;
    }

    public void setTriWaterContainTyp(String triWaterContainTyp) {
        this.triWaterContainTyp = triWaterContainTyp;
    }

    @Column(name = "tri_water_con_specify")
    public String getTriWaterConSpecify() {
        return triWaterConSpecify;
    }

    public void setTriWaterConSpecify(String triWaterConSpecify) {
        this.triWaterConSpecify = triWaterConSpecify;
    }

    @Column(name = "tri_water_treat_home", length = 1)
    public String getTriWaterTreatHome() {
        return triWaterTreatHome;
    }

    public void setTriWaterTreatHome(String triWaterTreatHome) {
        this.triWaterTreatHome = triWaterTreatHome;
    }

    @Column(name = "tri_water_treat_freq", length = 2)
    public String getTriWaterTreatFreq() {
        return triWaterTreatFreq;
    }

    public void setTriWaterTreatFreq(String triWaterTreatFreq) {
        this.triWaterTreatFreq = triWaterTreatFreq;
    }

    @Column(name = "tri_toilet_typ", length = 2)
    public String getTriToiletTyp() {
        return triToiletTyp;
    }

    public void setTriToiletTyp(String triToiletTyp) {
        this.triToiletTyp = triToiletTyp;
    }

    @Column(name = "tri_op_sewage_ind", length = 1)
    public String getTriOpSewageInd() {
        return triOpSewageInd;
    }

    public void setTriOpSewageInd(String triOpSewageInd) {
        this.triOpSewageInd = triOpSewageInd;
    }

    @Column(name = "tri_animals_ind", length = 1)
    public String getTriAnimalsInd() {
        return triAnimalsInd;
    }

    public void setTriAnimalsInd(String triAnimalsInd) {
        this.triAnimalsInd = triAnimalsInd;
    }

    @Column(name = "tri_animal_typ", length = 20)
    public String getTriAnimalTyp() {
        return triAnimalTyp;
    }

    public void setTriAnimalTyp(String triAnimalTyp) {
        this.triAnimalTyp = triAnimalTyp;
    }

    @Column(name = "tri_animal_specify")
    public String getTriAnimalSpecify() {
        return triAnimalSpecify;
    }

    public void setTriAnimalSpecify(String triAnimalSpecify) {
        this.triAnimalSpecify = triAnimalSpecify;
    }

    @Column(name = "tri_num_other_animal")
    public Integer getTriNumOtherAnimal() {
        return triNumOtherAnimal;
    }

    public void setTriNumOtherAnimal(Integer triNumOtherAnimal) {
        this.triNumOtherAnimal = triNumOtherAnimal;
    }

    @Column(name = "tri_num_cattle")
    public Integer getTriNumCattle() {
        return triNumCattle;
    }

    public void setTriNumCattle(Integer triNumCattle) {
        this.triNumCattle = triNumCattle;
    }

    @Column(name = "tri_num_pig")
    public Integer getTriNumPig() {
        return triNumPig;
    }

    public void setTriNumPig(Integer triNumPig) {
        this.triNumPig = triNumPig;
    }

    @Column(name = "tri_num_fowl")
    public Integer getTriNumFowl() {
        return triNumFowl;
    }

    public void setTriNumFowl(Integer triNumFowl) {
        this.triNumFowl = triNumFowl;
    }

    @Column(name = "tri_num_goats_sheep")
    public Integer getTriNumGoatsSheep() {
        return triNumGoatsSheep;
    }

    public void setTriNumGoatsSheep(Integer triNumGoatsSheep) {
        this.triNumGoatsSheep = triNumGoatsSheep;
    }

    @Column(name = "tri_smoke_ind", length = 1)
    public String getTriSmokeInd() {
        return triSmokeInd;
    }

    public void setTriSmokeInd(String triSmokeInd) {
        this.triSmokeInd = triSmokeInd;
    }

    @Column(name = "tri_bug_nuis_ind", length = 1)
    public String getTriBugNuisInd() {
        return triBugNuisInd;
    }

    public void setTriBugNuisInd(String triBugNuisInd) {
        this.triBugNuisInd = triBugNuisInd;
    }

    @Column(name = "tri_pest_stor_home_ind", length = 1)
    public String getTriPestStorHomeInd() {
        return triPestStorHomeInd;
    }

    public void setTriPestStorHomeInd(String triPestStorHomeInd) {
        this.triPestStorHomeInd = triPestStorHomeInd;
    }

    @Column(name = "tri_pest_app_home_ind", length = 1)
    public String getTriPestAppHomeInd() {
        return triPestAppHomeInd;
    }

    public void setTriPestAppHomeInd(String triPestAppHomeInd) {
        this.triPestAppHomeInd = triPestAppHomeInd;
    }

    @Column(name = "tri_pest_app_day", length = 2)
    public String getTriPestAppDay() {
        return triPestAppDay;
    }

    public void setTriPestAppDay(String triPestAppDay) {
        this.triPestAppDay = triPestAppDay;
    }

    @Column(name = "tri_pest_app_month", length = 2)
    public String getTriPestAppMonth() {
        return triPestAppMonth;
    }

    public void setTriPestAppMonth(String triPestAppMonth) {
        this.triPestAppMonth = triPestAppMonth;
    }

    @Column(name = "tri_pest_app_year", length = 4)
    public String getTriPestAppYear() {
        return triPestAppYear;
    }

    public void setTriPestAppYear(String triPestAppYear) {
        this.triPestAppYear = triPestAppYear;
    }

    @Column(name = "tri_pest_app_name")
    public String getTriPestAppName() {
        return triPestAppName;
    }

    public void setTriPestAppName(String triPestAppName) {
        this.triPestAppName = triPestAppName;
    }

    @Column(name = "tri_home_trtd_insct_ind", length = 1)
    public String getTriHomeTrtdInsctInd() {
        return triHomeTrtdInsctInd;
    }

    public void setTriHomeTrtdInsctInd(String triHomeTrtdInsctInd) {
        this.triHomeTrtdInsctInd = triHomeTrtdInsctInd;
    }

    @Column(name = "tri_home_trtd_loc", length = 1)
    public String getTriHomeTrtdLoc() {
        return triHomeTrtdLoc;
    }

    public void setTriHomeTrtdLoc(String triHomeTrtdLoc) {
        this.triHomeTrtdLoc = triHomeTrtdLoc;
    }

    @Column(name = "tri_home_trtd_entity", length = 1)
    public String getTriHomeTrtdEntity() {
        return triHomeTrtdEntity;
    }

    public void setTriHomeTrtdEntity(String triHomeTrtdEntity) {
        this.triHomeTrtdEntity = triHomeTrtdEntity;
    }

    @Column(name = "tri_home_trtd_names")
    public String getTriHomeTrtdNames() {
        return triHomeTrtdNames;
    }

    public void setTriHomeTrtdNames(String triHomeTrtdNames) {
        this.triHomeTrtdNames = triHomeTrtdNames;
    }

    @Column(name = "tri_trtmnt_app_day", length = 2)
    public String getTriTrtmntAppDay() {
        return triTrtmntAppDay;
    }

    public void setTriTrtmntAppDay(String triTrtmntAppDay) {
        this.triTrtmntAppDay = triTrtmntAppDay;
    }

    @Column(name = "tri_trtmnt_app_month", length = 2)
    public String getTriTrtmntAppMonth() {
        return triTrtmntAppMonth;
    }

    public void setTriTrtmntAppMonth(String triTrtmntAppMonth) {
        this.triTrtmntAppMonth = triTrtmntAppMonth;
    }

    @Column(name = "tri_trtmnt_app_year", length = 4)
    public String getTriTrtmntAppYear() {
        return triTrtmntAppYear;
    }

    public void setTriTrtmntAppYear(String triTrtmntAppYear) {
        this.triTrtmntAppYear = triTrtmntAppYear;
    }

    @Column(name = "tri_lwn_trtmnt_app_ind", length = 1)
    public String getTriLwnTrtmntAppInd() {
        return triLwnTrtmntAppInd;
    }

    public void setTriLwnTrtmntAppInd(String triLwnTrtmntAppInd) {
        this.triLwnTrtmntAppInd = triLwnTrtmntAppInd;
    }

    @Column(name = "tri_lwn_trtmnt_app_day", length = 2)
    public String getTriLwnTrtmntAppDay() {
        return triLwnTrtmntAppDay;
    }

    public void setTriLwnTrtmntAppDay(String triLwnTrtmntAppDay) {
        this.triLwnTrtmntAppDay = triLwnTrtmntAppDay;
    }

    @Column(name = "tri_lwn_trtmnt_app_month", length = 2)
    public String getTriLwnTrtmntAppMonth() {
        return triLwnTrtmntAppMonth;
    }

    public void setTriLwnTrtmntAppMonth(String triLwnTrtmntAppMonth) {
        this.triLwnTrtmntAppMonth = triLwnTrtmntAppMonth;
    }

    @Column(name = "tri_lwn_trtmnt_app_year", length = 4)
    public String getTriLwnTrtmntAppYear() {
        return triLwnTrtmntAppYear;
    }

    public void setTriLwnTrtmntAppYear(String triLwnTrtmntAppYear) {
        this.triLwnTrtmntAppYear = triLwnTrtmntAppYear;
    }

    @Column(name = "tri_lwn_trtmnt_app_name")
    public String getTriLwnTrtmntAppName() {
        return triLwnTrtmntAppName;
    }

    public void setTriLwnTrtmntAppName(String triLwnTrtmntAppName) {
        this.triLwnTrtmntAppName = triLwnTrtmntAppName;
    }

    @Column(name = "tri_mosq_rep_ind", length = 1)
    public String getTriMosqRepInd() {
        return triMosqRepInd;
    }

    public void setTriMosqRepInd(String triMosqRepInd) {
        this.triMosqRepInd = triMosqRepInd;
    }

    @Column(name = "tri_mosq_rep_typ", length = 25)
    public String getTriMosqRepTyp() {
        return triMosqRepTyp;
    }

    public void setTriMosqRepTyp(String triMosqRepTyp) {
        this.triMosqRepTyp = triMosqRepTyp;
    }

    @Column(name = "tri_mosq_rep_name_spray", length = 100)
    public String getTriMosqRepNameSpray() {
        return triMosqRepNameSpray;
    }

    public void setTriMosqRepNameSpray(String triMosqRepNameSpray) {
        this.triMosqRepNameSpray = triMosqRepNameSpray;
    }

    @Column(name = "tri_mosq_rep_dk_spray", length = 1)
    public String getTriMosqRepDkSpray() {
        return triMosqRepDkSpray;
    }

    public void setTriMosqRepDkSpray(String triMosqRepDkSpray) {
        this.triMosqRepDkSpray = triMosqRepDkSpray;
    }

    @Column(name = "tri_mosq_rep_name_lotion", length = 100)
    public String getTriMosqRepNameLotion() {
        return triMosqRepNameLotion;
    }

    public void setTriMosqRepNameLotion(String triMosqRepNameLotion) {
        this.triMosqRepNameLotion = triMosqRepNameLotion;
    }

    @Column(name = "tri_mosq_rep_dk_lotion", nullable = true, length = 1)
    public String getTriMosqRepDkLotion() {
        return triMosqRepDkLotion;
    }

    public void setTriMosqRepDkLotion(String triMosqRepDkLotion) {
        this.triMosqRepDkLotion = triMosqRepDkLotion;
    }

    @Column(name = "tri_mosq_rep_name_spiral", length = 100)
    public String getTriMosqRepNameSpiral() {
        return triMosqRepNameSpiral;
    }

    public void setTriMosqRepNameSpiral(String triMosqRepNameSpiral) {
        this.triMosqRepNameSpiral = triMosqRepNameSpiral;
    }

    @Column(name = "tri_mosq_rep_dk_spiral", length = 1)
    public String getTriMosqRepDkSpiral() {
        return triMosqRepDkSpiral;
    }

    public void setTriMosqRepDkSpiral(String triMosqRepDkSpiral) {
        this.triMosqRepDkSpiral = triMosqRepDkSpiral;
    }

    @Column(name = "tri_mosq_rep_name_plugin", length = 100)
    public String getTriMosqRepNamePlugin() {
        return triMosqRepNamePlugin;
    }

    public void setTriMosqRepNamePlugin(String triMosqRepNamePlugin) {
        this.triMosqRepNamePlugin = triMosqRepNamePlugin;
    }

    @Column(name = "tri_mosq_rep_dk_plugin", length = 1)
    public String getTriMosqRepDkPlugin() {
        return triMosqRepDkPlugin;
    }

    public void setTriMosqRepDkPlugin(String triMosqRepDkPlugin) {
        this.triMosqRepDkPlugin = triMosqRepDkPlugin;
    }

    @Column(name = "tri_mosq_rep_name_other", length = 100)
    public String getTriMosqRepNameOther() {
        return triMosqRepNameOther;
    }

    public void setTriMosqRepNameOther(String triMosqRepNameOther) {
        this.triMosqRepNameOther = triMosqRepNameOther;
    }

    @Column(name = "tri_mosq_rep_dk_other", length = 1)
    public String getTriMosqRepDkOther() {
        return triMosqRepDkOther;
    }

    public void setTriMosqRepDkOther(String triMosqRepDkOther) {
        this.triMosqRepDkOther = triMosqRepDkOther;
    }

    @Column(name = "tri_comp_id", length = 50)
    public String getTriCompId() {
        return triCompId;
    }

    public void setTriCompId(String triCompId) {
        this.triCompId = triCompId;
    }

    @Column(name = "tri_comp_dat")
    public Date getTriCompDat() {
        return triCompDat;
    }

    public void setTriCompDat(Date triCompDat) {
        this.triCompDat = triCompDat;
    }

    @Column(name = "tri_rev_id", length = 50)
    public String getTriRevId() {
        return triRevId;
    }

    public void setTriRevId(String triRevId) {
        this.triRevId = triRevId;
    }

    @Column(name = "tri_rev_dat")
    public Date getTriRevDat() {
        return triRevDat;
    }

    public void setTriRevDat(Date triRevDat) {
        this.triRevDat = triRevDat;
    }

    @Column(name = "tri_ent_id", length = 50)
    public String getTriEntId() {
        return triEntId;
    }

    public void setTriEntId(String triEntId) {
        this.triEntId = triEntId;
    }

    @Column(name = "tri_ent_dat")
    public Date getTriEntDat() {
        return triEntDat;
    }

    public void setTriEntDat(Date triEntDat) {
        this.triEntDat = triEntDat;
    }

    @Column(name = "tri_drink_ind", length = 1)
    public String getTriDrinkInd() {
        return triDrinkInd;
    }

    public void setTriDrinkInd(String triDrinkInd) {
        this.triDrinkInd = triDrinkInd;
    }

    @Column(name = "tri_drink_ever_ind", length = 1)
    public String getTriDrinkEverInd() {
        return triDrinkEverInd;
    }

    public void setTriDrinkEverInd(String triDrinkEverInd) {
        this.triDrinkEverInd = triDrinkEverInd;
    }

    @Override
    public boolean isFieldAuditable(String fieldname) {
        return true;
    }

    @Override
    public String toString() {
        return this.recordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Zpo04ExtendedSectionAtoF)) return false;

        Zpo04ExtendedSectionAtoF that = (Zpo04ExtendedSectionAtoF) o;

        return (recordId.equals(that.recordId));
    }
}
