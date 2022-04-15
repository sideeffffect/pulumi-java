// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateConfigSubjectConfigSubjectGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateConfigSubjectConfigSubjectGetArgs Empty = new CertificateConfigSubjectConfigSubjectGetArgs();

    /**
     * The common name of the distinguished name.
     * 
     */
    @Import(name="commonName", required=true)
      private final Output<String> commonName;

    public Output<String> commonName() {
        return this.commonName;
    }

    /**
     * The country code of the subject.
     * 
     */
    @Import(name="countryCode")
      private final @Nullable Output<String> countryCode;

    public Output<String> countryCode() {
        return this.countryCode == null ? Codegen.empty() : this.countryCode;
    }

    /**
     * The locality or city of the subject.
     * 
     */
    @Import(name="locality")
      private final @Nullable Output<String> locality;

    public Output<String> locality() {
        return this.locality == null ? Codegen.empty() : this.locality;
    }

    /**
     * The organization of the subject.
     * 
     */
    @Import(name="organization", required=true)
      private final Output<String> organization;

    public Output<String> organization() {
        return this.organization;
    }

    /**
     * The organizational unit of the subject.
     * 
     */
    @Import(name="organizationalUnit")
      private final @Nullable Output<String> organizationalUnit;

    public Output<String> organizationalUnit() {
        return this.organizationalUnit == null ? Codegen.empty() : this.organizationalUnit;
    }

    /**
     * The postal code of the subject.
     * 
     */
    @Import(name="postalCode")
      private final @Nullable Output<String> postalCode;

    public Output<String> postalCode() {
        return this.postalCode == null ? Codegen.empty() : this.postalCode;
    }

    /**
     * The province, territory, or regional state of the subject.
     * 
     */
    @Import(name="province")
      private final @Nullable Output<String> province;

    public Output<String> province() {
        return this.province == null ? Codegen.empty() : this.province;
    }

    /**
     * The street address of the subject.
     * 
     */
    @Import(name="streetAddress")
      private final @Nullable Output<String> streetAddress;

    public Output<String> streetAddress() {
        return this.streetAddress == null ? Codegen.empty() : this.streetAddress;
    }

    public CertificateConfigSubjectConfigSubjectGetArgs(
        Output<String> commonName,
        @Nullable Output<String> countryCode,
        @Nullable Output<String> locality,
        Output<String> organization,
        @Nullable Output<String> organizationalUnit,
        @Nullable Output<String> postalCode,
        @Nullable Output<String> province,
        @Nullable Output<String> streetAddress) {
        this.commonName = Objects.requireNonNull(commonName, "expected parameter 'commonName' to be non-null");
        this.countryCode = countryCode;
        this.locality = locality;
        this.organization = Objects.requireNonNull(organization, "expected parameter 'organization' to be non-null");
        this.organizationalUnit = organizationalUnit;
        this.postalCode = postalCode;
        this.province = province;
        this.streetAddress = streetAddress;
    }

    private CertificateConfigSubjectConfigSubjectGetArgs() {
        this.commonName = Codegen.empty();
        this.countryCode = Codegen.empty();
        this.locality = Codegen.empty();
        this.organization = Codegen.empty();
        this.organizationalUnit = Codegen.empty();
        this.postalCode = Codegen.empty();
        this.province = Codegen.empty();
        this.streetAddress = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigSubjectConfigSubjectGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> commonName;
        private @Nullable Output<String> countryCode;
        private @Nullable Output<String> locality;
        private Output<String> organization;
        private @Nullable Output<String> organizationalUnit;
        private @Nullable Output<String> postalCode;
        private @Nullable Output<String> province;
        private @Nullable Output<String> streetAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigSubjectConfigSubjectGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.countryCode = defaults.countryCode;
    	      this.locality = defaults.locality;
    	      this.organization = defaults.organization;
    	      this.organizationalUnit = defaults.organizationalUnit;
    	      this.postalCode = defaults.postalCode;
    	      this.province = defaults.province;
    	      this.streetAddress = defaults.streetAddress;
        }

        public Builder commonName(Output<String> commonName) {
            this.commonName = Objects.requireNonNull(commonName);
            return this;
        }
        public Builder commonName(String commonName) {
            this.commonName = Output.of(Objects.requireNonNull(commonName));
            return this;
        }
        public Builder countryCode(@Nullable Output<String> countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public Builder countryCode(@Nullable String countryCode) {
            this.countryCode = Codegen.ofNullable(countryCode);
            return this;
        }
        public Builder locality(@Nullable Output<String> locality) {
            this.locality = locality;
            return this;
        }
        public Builder locality(@Nullable String locality) {
            this.locality = Codegen.ofNullable(locality);
            return this;
        }
        public Builder organization(Output<String> organization) {
            this.organization = Objects.requireNonNull(organization);
            return this;
        }
        public Builder organization(String organization) {
            this.organization = Output.of(Objects.requireNonNull(organization));
            return this;
        }
        public Builder organizationalUnit(@Nullable Output<String> organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }
        public Builder organizationalUnit(@Nullable String organizationalUnit) {
            this.organizationalUnit = Codegen.ofNullable(organizationalUnit);
            return this;
        }
        public Builder postalCode(@Nullable Output<String> postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder postalCode(@Nullable String postalCode) {
            this.postalCode = Codegen.ofNullable(postalCode);
            return this;
        }
        public Builder province(@Nullable Output<String> province) {
            this.province = province;
            return this;
        }
        public Builder province(@Nullable String province) {
            this.province = Codegen.ofNullable(province);
            return this;
        }
        public Builder streetAddress(@Nullable Output<String> streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }
        public Builder streetAddress(@Nullable String streetAddress) {
            this.streetAddress = Codegen.ofNullable(streetAddress);
            return this;
        }        public CertificateConfigSubjectConfigSubjectGetArgs build() {
            return new CertificateConfigSubjectConfigSubjectGetArgs(commonName, countryCode, locality, organization, organizationalUnit, postalCode, province, streetAddress);
        }
    }
}
