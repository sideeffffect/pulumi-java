// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;


public final class PolicyRestorePolicyArgs extends ResourceArgs {

    public static final PolicyRestorePolicyArgs Empty = new PolicyRestorePolicyArgs();

    /**
     * May only be set to true. If set, then the default Policy is restored.
     * 
     */
    @Import(name="default", required=true)
    private Output<Boolean> default_;

    /**
     * @return May only be set to true. If set, then the default Policy is restored.
     * 
     */
    public Output<Boolean> default_() {
        return this.default_;
    }

    private PolicyRestorePolicyArgs() {}

    private PolicyRestorePolicyArgs(PolicyRestorePolicyArgs $) {
        this.default_ = $.default_;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyRestorePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyRestorePolicyArgs $;

        public Builder() {
            $ = new PolicyRestorePolicyArgs();
        }

        public Builder(PolicyRestorePolicyArgs defaults) {
            $ = new PolicyRestorePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param default_ May only be set to true. If set, then the default Policy is restored.
         * 
         * @return builder
         * 
         */
        public Builder default_(Output<Boolean> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ May only be set to true. If set, then the default Policy is restored.
         * 
         * @return builder
         * 
         */
        public Builder default_(Boolean default_) {
            return default_(Output.of(default_));
        }

        public PolicyRestorePolicyArgs build() {
            $.default_ = Objects.requireNonNull($.default_, "expected parameter 'default' to be non-null");
            return $;
        }
    }

}
