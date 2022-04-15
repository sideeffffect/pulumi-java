// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final WebAclAssociationState Empty = new WebAclAssociationState();

    /**
     * The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
     * 
     */
    @Import(name="resourceArn")
      private final @Nullable Output<String> resourceArn;

    public Output<String> resourceArn() {
        return this.resourceArn == null ? Codegen.empty() : this.resourceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * 
     */
    @Import(name="webAclArn")
      private final @Nullable Output<String> webAclArn;

    public Output<String> webAclArn() {
        return this.webAclArn == null ? Codegen.empty() : this.webAclArn;
    }

    public WebAclAssociationState(
        @Nullable Output<String> resourceArn,
        @Nullable Output<String> webAclArn) {
        this.resourceArn = resourceArn;
        this.webAclArn = webAclArn;
    }

    private WebAclAssociationState() {
        this.resourceArn = Codegen.empty();
        this.webAclArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceArn;
        private @Nullable Output<String> webAclArn;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.webAclArn = defaults.webAclArn;
        }

        public Builder resourceArn(@Nullable Output<String> resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public Builder resourceArn(@Nullable String resourceArn) {
            this.resourceArn = Codegen.ofNullable(resourceArn);
            return this;
        }
        public Builder webAclArn(@Nullable Output<String> webAclArn) {
            this.webAclArn = webAclArn;
            return this;
        }
        public Builder webAclArn(@Nullable String webAclArn) {
            this.webAclArn = Codegen.ofNullable(webAclArn);
            return this;
        }        public WebAclAssociationState build() {
            return new WebAclAssociationState(resourceArn, webAclArn);
        }
    }
}
