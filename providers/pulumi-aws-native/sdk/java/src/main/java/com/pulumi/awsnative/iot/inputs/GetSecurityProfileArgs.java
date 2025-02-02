// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecurityProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecurityProfileArgs Empty = new GetSecurityProfileArgs();

    /**
     * A unique identifier for the security profile.
     * 
     */
    @Import(name="securityProfileName", required=true)
    private Output<String> securityProfileName;

    /**
     * @return A unique identifier for the security profile.
     * 
     */
    public Output<String> securityProfileName() {
        return this.securityProfileName;
    }

    private GetSecurityProfileArgs() {}

    private GetSecurityProfileArgs(GetSecurityProfileArgs $) {
        this.securityProfileName = $.securityProfileName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecurityProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecurityProfileArgs $;

        public Builder() {
            $ = new GetSecurityProfileArgs();
        }

        public Builder(GetSecurityProfileArgs defaults) {
            $ = new GetSecurityProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param securityProfileName A unique identifier for the security profile.
         * 
         * @return builder
         * 
         */
        public Builder securityProfileName(Output<String> securityProfileName) {
            $.securityProfileName = securityProfileName;
            return this;
        }

        /**
         * @param securityProfileName A unique identifier for the security profile.
         * 
         * @return builder
         * 
         */
        public Builder securityProfileName(String securityProfileName) {
            return securityProfileName(Output.of(securityProfileName));
        }

        public GetSecurityProfileArgs build() {
            $.securityProfileName = Objects.requireNonNull($.securityProfileName, "expected parameter 'securityProfileName' to be non-null");
            return $;
        }
    }

}
