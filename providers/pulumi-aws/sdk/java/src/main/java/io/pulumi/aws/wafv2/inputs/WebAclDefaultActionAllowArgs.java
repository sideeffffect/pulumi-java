// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowCustomRequestHandlingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclDefaultActionAllowArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclDefaultActionAllowArgs Empty = new WebAclDefaultActionAllowArgs();

    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    @InputImport(name="customRequestHandling")
      private final @Nullable Input<WebAclDefaultActionAllowCustomRequestHandlingArgs> customRequestHandling;

    public Input<WebAclDefaultActionAllowCustomRequestHandlingArgs> getCustomRequestHandling() {
        return this.customRequestHandling == null ? Input.empty() : this.customRequestHandling;
    }

    public WebAclDefaultActionAllowArgs(@Nullable Input<WebAclDefaultActionAllowCustomRequestHandlingArgs> customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    private WebAclDefaultActionAllowArgs() {
        this.customRequestHandling = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclDefaultActionAllowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclDefaultActionAllowCustomRequestHandlingArgs> customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclDefaultActionAllowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder customRequestHandling(@Nullable Input<WebAclDefaultActionAllowCustomRequestHandlingArgs> customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }

        public Builder customRequestHandling(@Nullable WebAclDefaultActionAllowCustomRequestHandlingArgs customRequestHandling) {
            this.customRequestHandling = Input.ofNullable(customRequestHandling);
            return this;
        }
        public WebAclDefaultActionAllowArgs build() {
            return new WebAclDefaultActionAllowArgs(customRequestHandling);
        }
    }
}
