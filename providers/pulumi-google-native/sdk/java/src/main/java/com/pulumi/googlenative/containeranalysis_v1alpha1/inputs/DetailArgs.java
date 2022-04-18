// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.VersionArgs;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.VulnerabilityLocationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identifies all occurrences of this vulnerability in the package for a specific distro/location For example: glibc in cpe:/o:debian:debian_linux:8 for versions 2.1 - 2.2
 * 
 */
public final class DetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final DetailArgs Empty = new DetailArgs();

    /**
     * The cpe_uri in [cpe format] (https://cpe.mitre.org/specification/) in which the vulnerability manifests. Examples include distro or storage location for vulnerable jar. This field can be used as a filter in list requests.
     * 
     */
    @Import(name="cpeUri")
      private final @Nullable Output<String> cpeUri;

    public Output<String> cpeUri() {
        return this.cpeUri == null ? Codegen.empty() : this.cpeUri;
    }

    /**
     * A vendor-specific description of this note.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The fix for this specific package version.
     * 
     */
    @Import(name="fixedLocation")
      private final @Nullable Output<VulnerabilityLocationArgs> fixedLocation;

    public Output<VulnerabilityLocationArgs> fixedLocation() {
        return this.fixedLocation == null ? Codegen.empty() : this.fixedLocation;
    }

    /**
     * Whether this Detail is obsolete. Occurrences are expected not to point to obsolete details.
     * 
     */
    @Import(name="isObsolete")
      private final @Nullable Output<Boolean> isObsolete;

    public Output<Boolean> isObsolete() {
        return this.isObsolete == null ? Codegen.empty() : this.isObsolete;
    }

    /**
     * The max version of the package in which the vulnerability exists.
     * 
     */
    @Import(name="maxAffectedVersion")
      private final @Nullable Output<VersionArgs> maxAffectedVersion;

    public Output<VersionArgs> maxAffectedVersion() {
        return this.maxAffectedVersion == null ? Codegen.empty() : this.maxAffectedVersion;
    }

    /**
     * The min version of the package in which the vulnerability exists.
     * 
     */
    @Import(name="minAffectedVersion")
      private final @Nullable Output<VersionArgs> minAffectedVersion;

    public Output<VersionArgs> minAffectedVersion() {
        return this.minAffectedVersion == null ? Codegen.empty() : this.minAffectedVersion;
    }

    /**
     * The name of the package where the vulnerability was found. This field can be used as a filter in list requests.
     * 
     */
    @Import(name="package")
      private final @Nullable Output<String> package_;

    public Output<String> package_() {
        return this.package_ == null ? Codegen.empty() : this.package_;
    }

    /**
     * The type of package; whether native or non native(ruby gems, node.js packages etc)
     * 
     */
    @Import(name="packageType")
      private final @Nullable Output<String> packageType;

    public Output<String> packageType() {
        return this.packageType == null ? Codegen.empty() : this.packageType;
    }

    /**
     * The severity (eg: distro assigned severity) for this vulnerability.
     * 
     */
    @Import(name="severityName")
      private final @Nullable Output<String> severityName;

    public Output<String> severityName() {
        return this.severityName == null ? Codegen.empty() : this.severityName;
    }

    /**
     * The source from which the information in this Detail was obtained.
     * 
     */
    @Import(name="source")
      private final @Nullable Output<String> source;

    public Output<String> source() {
        return this.source == null ? Codegen.empty() : this.source;
    }

    /**
     * The vendor of the product. e.g. "google"
     * 
     */
    @Import(name="vendor")
      private final @Nullable Output<String> vendor;

    public Output<String> vendor() {
        return this.vendor == null ? Codegen.empty() : this.vendor;
    }

    public DetailArgs(
        @Nullable Output<String> cpeUri,
        @Nullable Output<String> description,
        @Nullable Output<VulnerabilityLocationArgs> fixedLocation,
        @Nullable Output<Boolean> isObsolete,
        @Nullable Output<VersionArgs> maxAffectedVersion,
        @Nullable Output<VersionArgs> minAffectedVersion,
        @Nullable Output<String> package_,
        @Nullable Output<String> packageType,
        @Nullable Output<String> severityName,
        @Nullable Output<String> source,
        @Nullable Output<String> vendor) {
        this.cpeUri = cpeUri;
        this.description = description;
        this.fixedLocation = fixedLocation;
        this.isObsolete = isObsolete;
        this.maxAffectedVersion = maxAffectedVersion;
        this.minAffectedVersion = minAffectedVersion;
        this.package_ = package_;
        this.packageType = packageType;
        this.severityName = severityName;
        this.source = source;
        this.vendor = vendor;
    }

    private DetailArgs() {
        this.cpeUri = Codegen.empty();
        this.description = Codegen.empty();
        this.fixedLocation = Codegen.empty();
        this.isObsolete = Codegen.empty();
        this.maxAffectedVersion = Codegen.empty();
        this.minAffectedVersion = Codegen.empty();
        this.package_ = Codegen.empty();
        this.packageType = Codegen.empty();
        this.severityName = Codegen.empty();
        this.source = Codegen.empty();
        this.vendor = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cpeUri;
        private @Nullable Output<String> description;
        private @Nullable Output<VulnerabilityLocationArgs> fixedLocation;
        private @Nullable Output<Boolean> isObsolete;
        private @Nullable Output<VersionArgs> maxAffectedVersion;
        private @Nullable Output<VersionArgs> minAffectedVersion;
        private @Nullable Output<String> package_;
        private @Nullable Output<String> packageType;
        private @Nullable Output<String> severityName;
        private @Nullable Output<String> source;
        private @Nullable Output<String> vendor;

        public Builder() {
    	      // Empty
        }

        public Builder(DetailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.fixedLocation = defaults.fixedLocation;
    	      this.isObsolete = defaults.isObsolete;
    	      this.maxAffectedVersion = defaults.maxAffectedVersion;
    	      this.minAffectedVersion = defaults.minAffectedVersion;
    	      this.package_ = defaults.package_;
    	      this.packageType = defaults.packageType;
    	      this.severityName = defaults.severityName;
    	      this.source = defaults.source;
    	      this.vendor = defaults.vendor;
        }

        public Builder cpeUri(@Nullable Output<String> cpeUri) {
            this.cpeUri = cpeUri;
            return this;
        }
        public Builder cpeUri(@Nullable String cpeUri) {
            this.cpeUri = Codegen.ofNullable(cpeUri);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder fixedLocation(@Nullable Output<VulnerabilityLocationArgs> fixedLocation) {
            this.fixedLocation = fixedLocation;
            return this;
        }
        public Builder fixedLocation(@Nullable VulnerabilityLocationArgs fixedLocation) {
            this.fixedLocation = Codegen.ofNullable(fixedLocation);
            return this;
        }
        public Builder isObsolete(@Nullable Output<Boolean> isObsolete) {
            this.isObsolete = isObsolete;
            return this;
        }
        public Builder isObsolete(@Nullable Boolean isObsolete) {
            this.isObsolete = Codegen.ofNullable(isObsolete);
            return this;
        }
        public Builder maxAffectedVersion(@Nullable Output<VersionArgs> maxAffectedVersion) {
            this.maxAffectedVersion = maxAffectedVersion;
            return this;
        }
        public Builder maxAffectedVersion(@Nullable VersionArgs maxAffectedVersion) {
            this.maxAffectedVersion = Codegen.ofNullable(maxAffectedVersion);
            return this;
        }
        public Builder minAffectedVersion(@Nullable Output<VersionArgs> minAffectedVersion) {
            this.minAffectedVersion = minAffectedVersion;
            return this;
        }
        public Builder minAffectedVersion(@Nullable VersionArgs minAffectedVersion) {
            this.minAffectedVersion = Codegen.ofNullable(minAffectedVersion);
            return this;
        }
        public Builder package_(@Nullable Output<String> package_) {
            this.package_ = package_;
            return this;
        }
        public Builder package_(@Nullable String package_) {
            this.package_ = Codegen.ofNullable(package_);
            return this;
        }
        public Builder packageType(@Nullable Output<String> packageType) {
            this.packageType = packageType;
            return this;
        }
        public Builder packageType(@Nullable String packageType) {
            this.packageType = Codegen.ofNullable(packageType);
            return this;
        }
        public Builder severityName(@Nullable Output<String> severityName) {
            this.severityName = severityName;
            return this;
        }
        public Builder severityName(@Nullable String severityName) {
            this.severityName = Codegen.ofNullable(severityName);
            return this;
        }
        public Builder source(@Nullable Output<String> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = Codegen.ofNullable(source);
            return this;
        }
        public Builder vendor(@Nullable Output<String> vendor) {
            this.vendor = vendor;
            return this;
        }
        public Builder vendor(@Nullable String vendor) {
            this.vendor = Codegen.ofNullable(vendor);
            return this;
        }        public DetailArgs build() {
            return new DetailArgs(cpeUri, description, fixedLocation, isObsolete, maxAffectedVersion, minAffectedVersion, package_, packageType, severityName, source, vendor);
        }
    }
}
