// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowArgs;
import com.pulumi.aws.wafv2.inputs.WebAclDefaultActionBlockArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclDefaultActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclDefaultActionArgs Empty = new WebAclDefaultActionArgs();

    /**
     * Specifies that AWS WAF should allow requests by default. See Allow below for details.
     * 
     */
    @Import(name="allow")
    private @Nullable Output<WebAclDefaultActionAllowArgs> allow;

    public Optional<Output<WebAclDefaultActionAllowArgs>> allow() {
        return Optional.ofNullable(this.allow);
    }

    /**
     * Specifies that AWS WAF should block requests by default. See Block below for details.
     * 
     */
    @Import(name="block")
    private @Nullable Output<WebAclDefaultActionBlockArgs> block;

    public Optional<Output<WebAclDefaultActionBlockArgs>> block() {
        return Optional.ofNullable(this.block);
    }

    private WebAclDefaultActionArgs() {}

    private WebAclDefaultActionArgs(WebAclDefaultActionArgs $) {
        this.allow = $.allow;
        this.block = $.block;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclDefaultActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclDefaultActionArgs $;

        public Builder() {
            $ = new WebAclDefaultActionArgs();
        }

        public Builder(WebAclDefaultActionArgs defaults) {
            $ = new WebAclDefaultActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder allow(@Nullable Output<WebAclDefaultActionAllowArgs> allow) {
            $.allow = allow;
            return this;
        }

        public Builder allow(WebAclDefaultActionAllowArgs allow) {
            return allow(Output.of(allow));
        }

        public Builder block(@Nullable Output<WebAclDefaultActionBlockArgs> block) {
            $.block = block;
            return this;
        }

        public Builder block(WebAclDefaultActionBlockArgs block) {
            return block(Output.of(block));
        }

        public WebAclDefaultActionArgs build() {
            return $;
        }
    }

}
