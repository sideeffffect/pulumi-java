// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebACLAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebACLAssociationArgs Empty = new WebACLAssociationArgs();

    @Import(name="resourceArn", required=true)
    private Output<String> resourceArn;

    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    @Import(name="webACLArn", required=true)
    private Output<String> webACLArn;

    public Output<String> webACLArn() {
        return this.webACLArn;
    }

    private WebACLAssociationArgs() {}

    private WebACLAssociationArgs(WebACLAssociationArgs $) {
        this.resourceArn = $.resourceArn;
        this.webACLArn = $.webACLArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLAssociationArgs $;

        public Builder() {
            $ = new WebACLAssociationArgs();
        }

        public Builder(WebACLAssociationArgs defaults) {
            $ = new WebACLAssociationArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceArn(Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        public Builder webACLArn(Output<String> webACLArn) {
            $.webACLArn = webACLArn;
            return this;
        }

        public Builder webACLArn(String webACLArn) {
            return webACLArn(Output.of(webACLArn));
        }

        public WebACLAssociationArgs build() {
            $.resourceArn = Objects.requireNonNull($.resourceArn, "expected parameter 'resourceArn' to be non-null");
            $.webACLArn = Objects.requireNonNull($.webACLArn, "expected parameter 'webACLArn' to be non-null");
            return $;
        }
    }

}
