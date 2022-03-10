// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleLambdaAction extends io.pulumi.resources.InvokeArgs {

    public static final TopicRuleLambdaAction Empty = new TopicRuleLambdaAction();

    @InputImport(name="functionArn")
      private final @Nullable String functionArn;

    public Optional<String> getFunctionArn() {
        return this.functionArn == null ? Optional.empty() : Optional.ofNullable(this.functionArn);
    }

    public TopicRuleLambdaAction(@Nullable String functionArn) {
        this.functionArn = functionArn;
    }

    private TopicRuleLambdaAction() {
        this.functionArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleLambdaAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String functionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleLambdaAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
        }

        public Builder functionArn(@Nullable String functionArn) {
            this.functionArn = functionArn;
            return this;
        }
        public TopicRuleLambdaAction build() {
            return new TopicRuleLambdaAction(functionArn);
        }
    }
}
