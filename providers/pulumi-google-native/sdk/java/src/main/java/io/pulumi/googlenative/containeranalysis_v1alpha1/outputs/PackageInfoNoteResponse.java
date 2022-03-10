// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.ExternalRefResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.LicenseResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class PackageInfoNoteResponse {
    /**
     * Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document
     * 
     */
    private final Boolean analyzed;
    /**
     * A place for the SPDX data creator to record, at the package level, acknowledgements that may be needed to be communicated in some contexts
     * 
     */
    private final String attribution;
    /**
     * Provide an independently reproducible mechanism that permits unique identification of a specific package that correlates to the data in this SPDX file
     * 
     */
    private final String checksum;
    /**
     * Identify the copyright holders of the package, as well as any dates present
     * 
     */
    private final String copyright;
    /**
     * A more detailed description of the package
     * 
     */
    private final String detailedDescription;
    /**
     * This section identifies the download Universal Resource Locator (URL), or a specific location within a version control system (VCS) for the package at the time that the SPDX file was created
     * 
     */
    private final String downloadLocation;
    /**
     * ExternalRef
     * 
     */
    private final List<ExternalRefResponse> externalRefs;
    /**
     * Contain the license the SPDX file creator has concluded as governing the This field is to contain a list of all licenses found in the package. The relationship between licenses (i.e., conjunctive, disjunctive) is not specified in this field – it is simply a listing of all licenses found
     * 
     */
    private final List<String> filesLicenseInfo;
    /**
     * Provide a place for the SPDX file creator to record a web site that serves as the package's home page
     * 
     */
    private final String homePage;
    /**
     * List the licenses that have been declared by the authors of the package
     * 
     */
    private final LicenseResponse licenseDeclared;
    /**
     * If the package identified in the SPDX file originated from a different person or organization than identified as Package Supplier, this field identifies from where or whom the package originally came
     * 
     */
    private final String originator;
    /**
     * The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
     * 
     */
    private final String packageType;
    /**
     * A short description of the package
     * 
     */
    private final String summaryDescription;
    /**
     * Identify the actual distribution source for the package/directory identified in the SPDX file
     * 
     */
    private final String supplier;
    /**
     * Identify the full name of the package as given by the Package Originator
     * 
     */
    private final String title;
    /**
     * This field provides an independently reproducible mechanism identifying specific contents of a package based on the actual files (except the SPDX file itself, if it is included in the package) that make up each package and that correlates to the data in this SPDX file
     * 
     */
    private final String verificationCode;
    /**
     * Identify the version of the package
     * 
     */
    private final String version;

    @OutputCustomType.Constructor
    private PackageInfoNoteResponse(
        @OutputCustomType.Parameter("analyzed") Boolean analyzed,
        @OutputCustomType.Parameter("attribution") String attribution,
        @OutputCustomType.Parameter("checksum") String checksum,
        @OutputCustomType.Parameter("copyright") String copyright,
        @OutputCustomType.Parameter("detailedDescription") String detailedDescription,
        @OutputCustomType.Parameter("downloadLocation") String downloadLocation,
        @OutputCustomType.Parameter("externalRefs") List<ExternalRefResponse> externalRefs,
        @OutputCustomType.Parameter("filesLicenseInfo") List<String> filesLicenseInfo,
        @OutputCustomType.Parameter("homePage") String homePage,
        @OutputCustomType.Parameter("licenseDeclared") LicenseResponse licenseDeclared,
        @OutputCustomType.Parameter("originator") String originator,
        @OutputCustomType.Parameter("packageType") String packageType,
        @OutputCustomType.Parameter("summaryDescription") String summaryDescription,
        @OutputCustomType.Parameter("supplier") String supplier,
        @OutputCustomType.Parameter("title") String title,
        @OutputCustomType.Parameter("verificationCode") String verificationCode,
        @OutputCustomType.Parameter("version") String version) {
        this.analyzed = analyzed;
        this.attribution = attribution;
        this.checksum = checksum;
        this.copyright = copyright;
        this.detailedDescription = detailedDescription;
        this.downloadLocation = downloadLocation;
        this.externalRefs = externalRefs;
        this.filesLicenseInfo = filesLicenseInfo;
        this.homePage = homePage;
        this.licenseDeclared = licenseDeclared;
        this.originator = originator;
        this.packageType = packageType;
        this.summaryDescription = summaryDescription;
        this.supplier = supplier;
        this.title = title;
        this.verificationCode = verificationCode;
        this.version = version;
    }

    /**
     * Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document
     * 
    */
    public Boolean getAnalyzed() {
        return this.analyzed;
    }
    /**
     * A place for the SPDX data creator to record, at the package level, acknowledgements that may be needed to be communicated in some contexts
     * 
    */
    public String getAttribution() {
        return this.attribution;
    }
    /**
     * Provide an independently reproducible mechanism that permits unique identification of a specific package that correlates to the data in this SPDX file
     * 
    */
    public String getChecksum() {
        return this.checksum;
    }
    /**
     * Identify the copyright holders of the package, as well as any dates present
     * 
    */
    public String getCopyright() {
        return this.copyright;
    }
    /**
     * A more detailed description of the package
     * 
    */
    public String getDetailedDescription() {
        return this.detailedDescription;
    }
    /**
     * This section identifies the download Universal Resource Locator (URL), or a specific location within a version control system (VCS) for the package at the time that the SPDX file was created
     * 
    */
    public String getDownloadLocation() {
        return this.downloadLocation;
    }
    /**
     * ExternalRef
     * 
    */
    public List<ExternalRefResponse> getExternalRefs() {
        return this.externalRefs;
    }
    /**
     * Contain the license the SPDX file creator has concluded as governing the This field is to contain a list of all licenses found in the package. The relationship between licenses (i.e., conjunctive, disjunctive) is not specified in this field – it is simply a listing of all licenses found
     * 
    */
    public List<String> getFilesLicenseInfo() {
        return this.filesLicenseInfo;
    }
    /**
     * Provide a place for the SPDX file creator to record a web site that serves as the package's home page
     * 
    */
    public String getHomePage() {
        return this.homePage;
    }
    /**
     * List the licenses that have been declared by the authors of the package
     * 
    */
    public LicenseResponse getLicenseDeclared() {
        return this.licenseDeclared;
    }
    /**
     * If the package identified in the SPDX file originated from a different person or organization than identified as Package Supplier, this field identifies from where or whom the package originally came
     * 
    */
    public String getOriginator() {
        return this.originator;
    }
    /**
     * The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
     * 
    */
    public String getPackageType() {
        return this.packageType;
    }
    /**
     * A short description of the package
     * 
    */
    public String getSummaryDescription() {
        return this.summaryDescription;
    }
    /**
     * Identify the actual distribution source for the package/directory identified in the SPDX file
     * 
    */
    public String getSupplier() {
        return this.supplier;
    }
    /**
     * Identify the full name of the package as given by the Package Originator
     * 
    */
    public String getTitle() {
        return this.title;
    }
    /**
     * This field provides an independently reproducible mechanism identifying specific contents of a package based on the actual files (except the SPDX file itself, if it is included in the package) that make up each package and that correlates to the data in this SPDX file
     * 
    */
    public String getVerificationCode() {
        return this.verificationCode;
    }
    /**
     * Identify the version of the package
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageInfoNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean analyzed;
        private String attribution;
        private String checksum;
        private String copyright;
        private String detailedDescription;
        private String downloadLocation;
        private List<ExternalRefResponse> externalRefs;
        private List<String> filesLicenseInfo;
        private String homePage;
        private LicenseResponse licenseDeclared;
        private String originator;
        private String packageType;
        private String summaryDescription;
        private String supplier;
        private String title;
        private String verificationCode;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageInfoNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyzed = defaults.analyzed;
    	      this.attribution = defaults.attribution;
    	      this.checksum = defaults.checksum;
    	      this.copyright = defaults.copyright;
    	      this.detailedDescription = defaults.detailedDescription;
    	      this.downloadLocation = defaults.downloadLocation;
    	      this.externalRefs = defaults.externalRefs;
    	      this.filesLicenseInfo = defaults.filesLicenseInfo;
    	      this.homePage = defaults.homePage;
    	      this.licenseDeclared = defaults.licenseDeclared;
    	      this.originator = defaults.originator;
    	      this.packageType = defaults.packageType;
    	      this.summaryDescription = defaults.summaryDescription;
    	      this.supplier = defaults.supplier;
    	      this.title = defaults.title;
    	      this.verificationCode = defaults.verificationCode;
    	      this.version = defaults.version;
        }

        public Builder analyzed(Boolean analyzed) {
            this.analyzed = Objects.requireNonNull(analyzed);
            return this;
        }

        public Builder attribution(String attribution) {
            this.attribution = Objects.requireNonNull(attribution);
            return this;
        }

        public Builder checksum(String checksum) {
            this.checksum = Objects.requireNonNull(checksum);
            return this;
        }

        public Builder copyright(String copyright) {
            this.copyright = Objects.requireNonNull(copyright);
            return this;
        }

        public Builder detailedDescription(String detailedDescription) {
            this.detailedDescription = Objects.requireNonNull(detailedDescription);
            return this;
        }

        public Builder downloadLocation(String downloadLocation) {
            this.downloadLocation = Objects.requireNonNull(downloadLocation);
            return this;
        }

        public Builder externalRefs(List<ExternalRefResponse> externalRefs) {
            this.externalRefs = Objects.requireNonNull(externalRefs);
            return this;
        }

        public Builder filesLicenseInfo(List<String> filesLicenseInfo) {
            this.filesLicenseInfo = Objects.requireNonNull(filesLicenseInfo);
            return this;
        }

        public Builder homePage(String homePage) {
            this.homePage = Objects.requireNonNull(homePage);
            return this;
        }

        public Builder licenseDeclared(LicenseResponse licenseDeclared) {
            this.licenseDeclared = Objects.requireNonNull(licenseDeclared);
            return this;
        }

        public Builder originator(String originator) {
            this.originator = Objects.requireNonNull(originator);
            return this;
        }

        public Builder packageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }

        public Builder summaryDescription(String summaryDescription) {
            this.summaryDescription = Objects.requireNonNull(summaryDescription);
            return this;
        }

        public Builder supplier(String supplier) {
            this.supplier = Objects.requireNonNull(supplier);
            return this;
        }

        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder verificationCode(String verificationCode) {
            this.verificationCode = Objects.requireNonNull(verificationCode);
            return this;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public PackageInfoNoteResponse build() {
            return new PackageInfoNoteResponse(analyzed, attribution, checksum, copyright, detailedDescription, downloadLocation, externalRefs, filesLicenseInfo, homePage, licenseDeclared, originator, packageType, summaryDescription, supplier, title, verificationCode, version);
        }
    }
}
