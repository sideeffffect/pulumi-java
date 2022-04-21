// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MultiRegionAccessPointPolicyDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointPolicyDetailsArgs Empty = new MultiRegionAccessPointPolicyDetailsArgs();

    /**
     * The name of the Multi-Region Access Point.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * A valid JSON document that specifies the policy that you want to associate with this Multi-Region Access Point. Once applied, the policy can be edited, but not deleted. For more information, see the documentation on [Multi-Region Access Point Permissions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointPermissions.html).
     * 
     */
    @Import(name="policy", required=true)
    private Output<String> policy;

    public Output<String> policy() {
        return this.policy;
    }

    private MultiRegionAccessPointPolicyDetailsArgs() {}

    private MultiRegionAccessPointPolicyDetailsArgs(MultiRegionAccessPointPolicyDetailsArgs $) {
        this.name = $.name;
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultiRegionAccessPointPolicyDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultiRegionAccessPointPolicyDetailsArgs $;

        public Builder() {
            $ = new MultiRegionAccessPointPolicyDetailsArgs();
        }

        public Builder(MultiRegionAccessPointPolicyDetailsArgs defaults) {
            $ = new MultiRegionAccessPointPolicyDetailsArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder policy(Output<String> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public MultiRegionAccessPointPolicyDetailsArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            return $;
        }
    }

}
