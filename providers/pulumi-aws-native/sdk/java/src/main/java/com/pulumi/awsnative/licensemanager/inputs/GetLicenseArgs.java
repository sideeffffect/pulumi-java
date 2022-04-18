// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.licensemanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLicenseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLicenseArgs Empty = new GetLicenseArgs();

    /**
     * Amazon Resource Name is a unique name for each resource.
     * 
     */
    @Import(name="licenseArn", required=true)
      private final String licenseArn;

    public String licenseArn() {
        return this.licenseArn;
    }

    public GetLicenseArgs(String licenseArn) {
        this.licenseArn = Objects.requireNonNull(licenseArn, "expected parameter 'licenseArn' to be non-null");
    }

    private GetLicenseArgs() {
        this.licenseArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String licenseArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLicenseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.licenseArn = defaults.licenseArn;
        }

        public Builder licenseArn(String licenseArn) {
            this.licenseArn = Objects.requireNonNull(licenseArn);
            return this;
        }        public GetLicenseArgs build() {
            return new GetLicenseArgs(licenseArn);
        }
    }
}
