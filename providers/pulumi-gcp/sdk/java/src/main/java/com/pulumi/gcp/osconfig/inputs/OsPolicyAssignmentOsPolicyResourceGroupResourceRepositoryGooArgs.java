// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs extends ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs();

    /**
     * Required. The name of the repository.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Required. The name of the repository.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Required. The url of the repository.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return Required. The url of the repository.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs() {}

    private OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs $) {
        this.name = $.name;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs();
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs defaults) {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Required. The name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Required. The name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param url Required. The url of the repository.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Required. The url of the repository.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
