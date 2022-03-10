// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WebAclAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclAssociationArgs Empty = new WebAclAssociationArgs();

    /**
     * The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
     * 
     */
    @InputImport(name="resourceArn", required=true)
      private final Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * 
     */
    @InputImport(name="webAclArn", required=true)
      private final Input<String> webAclArn;

    public Input<String> getWebAclArn() {
        return this.webAclArn;
    }

    public WebAclAssociationArgs(
        Input<String> resourceArn,
        Input<String> webAclArn) {
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
        this.webAclArn = Objects.requireNonNull(webAclArn, "expected parameter 'webAclArn' to be non-null");
    }

    private WebAclAssociationArgs() {
        this.resourceArn = Input.empty();
        this.webAclArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> resourceArn;
        private Input<String> webAclArn;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.webAclArn = defaults.webAclArn;
        }

        public Builder resourceArn(Input<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Input.of(Objects.requireNonNull(resourceArn));
            return this;
        }

        public Builder webAclArn(Input<String> webAclArn) {
            this.webAclArn = Objects.requireNonNull(webAclArn);
            return this;
        }

        public Builder webAclArn(String webAclArn) {
            this.webAclArn = Input.of(Objects.requireNonNull(webAclArn));
            return this;
        }
        public WebAclAssociationArgs build() {
            return new WebAclAssociationArgs(resourceArn, webAclArn);
        }
    }
}
