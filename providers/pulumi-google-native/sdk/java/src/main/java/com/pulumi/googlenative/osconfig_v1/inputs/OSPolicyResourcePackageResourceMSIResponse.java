// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceFileResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An MSI package. MSI packages only support INSTALLED state.
 * 
 */
public final class OSPolicyResourcePackageResourceMSIResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourcePackageResourceMSIResponse Empty = new OSPolicyResourcePackageResourceMSIResponse();

    /**
     * Additional properties to use during installation. This should be in the format of Property=Setting. Appended to the defaults of `ACTION=INSTALL REBOOT=ReallySuppress`.
     * 
     */
    @Import(name="properties", required=true)
    private List<String> properties;

    public List<String> properties() {
        return this.properties;
    }

    /**
     * The MSI package.
     * 
     */
    @Import(name="source", required=true)
    private OSPolicyResourceFileResponse source;

    public OSPolicyResourceFileResponse source() {
        return this.source;
    }

    private OSPolicyResourcePackageResourceMSIResponse() {}

    private OSPolicyResourcePackageResourceMSIResponse(OSPolicyResourcePackageResourceMSIResponse $) {
        this.properties = $.properties;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourcePackageResourceMSIResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourcePackageResourceMSIResponse $;

        public Builder() {
            $ = new OSPolicyResourcePackageResourceMSIResponse();
        }

        public Builder(OSPolicyResourcePackageResourceMSIResponse defaults) {
            $ = new OSPolicyResourcePackageResourceMSIResponse(Objects.requireNonNull(defaults));
        }

        public Builder properties(List<String> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(String... properties) {
            return properties(List.of(properties));
        }

        public Builder source(OSPolicyResourceFileResponse source) {
            $.source = source;
            return this;
        }

        public OSPolicyResourcePackageResourceMSIResponse build() {
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
