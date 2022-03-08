// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.VersionResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DetailResponse {
    /**
     * The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability affects.
     * 
     */
    private final String affectedCpeUri;
    /**
     * The package this vulnerability affects.
     * 
     */
    private final String affectedPackage;
    /**
     * The version number at the end of an interval in which this vulnerability exists. A vulnerability can affect a package between version numbers that are disjoint sets of intervals (example: [1.0.0-1.1.0], [2.4.6-2.4.8] and [4.5.6-4.6.8]) each of which will be represented in its own Detail. If a specific affected version is provided by a vulnerability database, affected_version_start and affected_version_end will be the same in that Detail.
     * 
     */
    private final VersionResponse affectedVersionEnd;
    /**
     * The version number at the start of an interval in which this vulnerability exists. A vulnerability can affect a package between version numbers that are disjoint sets of intervals (example: [1.0.0-1.1.0], [2.4.6-2.4.8] and [4.5.6-4.6.8]) each of which will be represented in its own Detail. If a specific affected version is provided by a vulnerability database, affected_version_start and affected_version_end will be the same in that Detail.
     * 
     */
    private final VersionResponse affectedVersionStart;
    /**
     * A vendor-specific description of this vulnerability.
     * 
     */
    private final String description;
    /**
     * The distro recommended [CPE URI](https://cpe.mitre.org/specification/) to update to that contains a fix for this vulnerability. It is possible for this to be different from the affected_cpe_uri.
     * 
     */
    private final String fixedCpeUri;
    /**
     * The distro recommended package to update to that contains a fix for this vulnerability. It is possible for this to be different from the affected_package.
     * 
     */
    private final String fixedPackage;
    /**
     * The distro recommended version to update to that contains a fix for this vulnerability. Setting this to VersionKind.MAXIMUM means no such version is yet available.
     * 
     */
    private final VersionResponse fixedVersion;
    /**
     * Whether this detail is obsolete. Occurrences are expected not to point to obsolete details.
     * 
     */
    private final Boolean isObsolete;
    /**
     * The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
     * 
     */
    private final String packageType;
    /**
     * The distro assigned severity of this vulnerability.
     * 
     */
    private final String severityName;
    /**
     * The source from which the information in this Detail was obtained.
     * 
     */
    private final String source;
    /**
     * The time this information was last changed at the source. This is an upstream timestamp from the underlying information source - e.g. Ubuntu security tracker.
     * 
     */
    private final String sourceUpdateTime;
    /**
     * The name of the vendor of the product.
     * 
     */
    private final String vendor;

    @OutputCustomType.Constructor({"affectedCpeUri","affectedPackage","affectedVersionEnd","affectedVersionStart","description","fixedCpeUri","fixedPackage","fixedVersion","isObsolete","packageType","severityName","source","sourceUpdateTime","vendor"})
    private DetailResponse(
        String affectedCpeUri,
        String affectedPackage,
        VersionResponse affectedVersionEnd,
        VersionResponse affectedVersionStart,
        String description,
        String fixedCpeUri,
        String fixedPackage,
        VersionResponse fixedVersion,
        Boolean isObsolete,
        String packageType,
        String severityName,
        String source,
        String sourceUpdateTime,
        String vendor) {
        this.affectedCpeUri = affectedCpeUri;
        this.affectedPackage = affectedPackage;
        this.affectedVersionEnd = affectedVersionEnd;
        this.affectedVersionStart = affectedVersionStart;
        this.description = description;
        this.fixedCpeUri = fixedCpeUri;
        this.fixedPackage = fixedPackage;
        this.fixedVersion = fixedVersion;
        this.isObsolete = isObsolete;
        this.packageType = packageType;
        this.severityName = severityName;
        this.source = source;
        this.sourceUpdateTime = sourceUpdateTime;
        this.vendor = vendor;
    }

    /**
     * The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability affects.
     * 
    */
    public String getAffectedCpeUri() {
        return this.affectedCpeUri;
    }
    /**
     * The package this vulnerability affects.
     * 
    */
    public String getAffectedPackage() {
        return this.affectedPackage;
    }
    /**
     * The version number at the end of an interval in which this vulnerability exists. A vulnerability can affect a package between version numbers that are disjoint sets of intervals (example: [1.0.0-1.1.0], [2.4.6-2.4.8] and [4.5.6-4.6.8]) each of which will be represented in its own Detail. If a specific affected version is provided by a vulnerability database, affected_version_start and affected_version_end will be the same in that Detail.
     * 
    */
    public VersionResponse getAffectedVersionEnd() {
        return this.affectedVersionEnd;
    }
    /**
     * The version number at the start of an interval in which this vulnerability exists. A vulnerability can affect a package between version numbers that are disjoint sets of intervals (example: [1.0.0-1.1.0], [2.4.6-2.4.8] and [4.5.6-4.6.8]) each of which will be represented in its own Detail. If a specific affected version is provided by a vulnerability database, affected_version_start and affected_version_end will be the same in that Detail.
     * 
    */
    public VersionResponse getAffectedVersionStart() {
        return this.affectedVersionStart;
    }
    /**
     * A vendor-specific description of this vulnerability.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The distro recommended [CPE URI](https://cpe.mitre.org/specification/) to update to that contains a fix for this vulnerability. It is possible for this to be different from the affected_cpe_uri.
     * 
    */
    public String getFixedCpeUri() {
        return this.fixedCpeUri;
    }
    /**
     * The distro recommended package to update to that contains a fix for this vulnerability. It is possible for this to be different from the affected_package.
     * 
    */
    public String getFixedPackage() {
        return this.fixedPackage;
    }
    /**
     * The distro recommended version to update to that contains a fix for this vulnerability. Setting this to VersionKind.MAXIMUM means no such version is yet available.
     * 
    */
    public VersionResponse getFixedVersion() {
        return this.fixedVersion;
    }
    /**
     * Whether this detail is obsolete. Occurrences are expected not to point to obsolete details.
     * 
    */
    public Boolean getIsObsolete() {
        return this.isObsolete;
    }
    /**
     * The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
     * 
    */
    public String getPackageType() {
        return this.packageType;
    }
    /**
     * The distro assigned severity of this vulnerability.
     * 
    */
    public String getSeverityName() {
        return this.severityName;
    }
    /**
     * The source from which the information in this Detail was obtained.
     * 
    */
    public String getSource() {
        return this.source;
    }
    /**
     * The time this information was last changed at the source. This is an upstream timestamp from the underlying information source - e.g. Ubuntu security tracker.
     * 
    */
    public String getSourceUpdateTime() {
        return this.sourceUpdateTime;
    }
    /**
     * The name of the vendor of the product.
     * 
    */
    public String getVendor() {
        return this.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String affectedCpeUri;
        private String affectedPackage;
        private VersionResponse affectedVersionEnd;
        private VersionResponse affectedVersionStart;
        private String description;
        private String fixedCpeUri;
        private String fixedPackage;
        private VersionResponse fixedVersion;
        private Boolean isObsolete;
        private String packageType;
        private String severityName;
        private String source;
        private String sourceUpdateTime;
        private String vendor;

        public Builder() {
    	      // Empty
        }

        public Builder(DetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affectedCpeUri = defaults.affectedCpeUri;
    	      this.affectedPackage = defaults.affectedPackage;
    	      this.affectedVersionEnd = defaults.affectedVersionEnd;
    	      this.affectedVersionStart = defaults.affectedVersionStart;
    	      this.description = defaults.description;
    	      this.fixedCpeUri = defaults.fixedCpeUri;
    	      this.fixedPackage = defaults.fixedPackage;
    	      this.fixedVersion = defaults.fixedVersion;
    	      this.isObsolete = defaults.isObsolete;
    	      this.packageType = defaults.packageType;
    	      this.severityName = defaults.severityName;
    	      this.source = defaults.source;
    	      this.sourceUpdateTime = defaults.sourceUpdateTime;
    	      this.vendor = defaults.vendor;
        }

        public Builder setAffectedCpeUri(String affectedCpeUri) {
            this.affectedCpeUri = Objects.requireNonNull(affectedCpeUri);
            return this;
        }

        public Builder setAffectedPackage(String affectedPackage) {
            this.affectedPackage = Objects.requireNonNull(affectedPackage);
            return this;
        }

        public Builder setAffectedVersionEnd(VersionResponse affectedVersionEnd) {
            this.affectedVersionEnd = Objects.requireNonNull(affectedVersionEnd);
            return this;
        }

        public Builder setAffectedVersionStart(VersionResponse affectedVersionStart) {
            this.affectedVersionStart = Objects.requireNonNull(affectedVersionStart);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFixedCpeUri(String fixedCpeUri) {
            this.fixedCpeUri = Objects.requireNonNull(fixedCpeUri);
            return this;
        }

        public Builder setFixedPackage(String fixedPackage) {
            this.fixedPackage = Objects.requireNonNull(fixedPackage);
            return this;
        }

        public Builder setFixedVersion(VersionResponse fixedVersion) {
            this.fixedVersion = Objects.requireNonNull(fixedVersion);
            return this;
        }

        public Builder setIsObsolete(Boolean isObsolete) {
            this.isObsolete = Objects.requireNonNull(isObsolete);
            return this;
        }

        public Builder setPackageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }

        public Builder setSeverityName(String severityName) {
            this.severityName = Objects.requireNonNull(severityName);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSourceUpdateTime(String sourceUpdateTime) {
            this.sourceUpdateTime = Objects.requireNonNull(sourceUpdateTime);
            return this;
        }

        public Builder setVendor(String vendor) {
            this.vendor = Objects.requireNonNull(vendor);
            return this;
        }
        public DetailResponse build() {
            return new DetailResponse(affectedCpeUri, affectedPackage, affectedVersionEnd, affectedVersionStart, description, fixedCpeUri, fixedPackage, fixedVersion, isObsolete, packageType, severityName, source, sourceUpdateTime, vendor);
        }
    }
}
