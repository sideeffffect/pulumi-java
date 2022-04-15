// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs();

    /**
     * Number of characters after the finding to consider. Either this or window_before must be specified
     * 
     */
    @Import(name="windowAfter")
      private final @Nullable Output<Integer> windowAfter;

    public Output<Integer> windowAfter() {
        return this.windowAfter == null ? Codegen.empty() : this.windowAfter;
    }

    /**
     * Number of characters before the finding to consider. Either this or window_after must be specified
     * 
     */
    @Import(name="windowBefore")
      private final @Nullable Output<Integer> windowBefore;

    public Output<Integer> windowBefore() {
        return this.windowBefore == null ? Codegen.empty() : this.windowBefore;
    }

    public PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs(
        @Nullable Output<Integer> windowAfter,
        @Nullable Output<Integer> windowBefore) {
        this.windowAfter = windowAfter;
        this.windowBefore = windowBefore;
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs() {
        this.windowAfter = Codegen.empty();
        this.windowBefore = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> windowAfter;
        private @Nullable Output<Integer> windowBefore;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.windowAfter = defaults.windowAfter;
    	      this.windowBefore = defaults.windowBefore;
        }

        public Builder windowAfter(@Nullable Output<Integer> windowAfter) {
            this.windowAfter = windowAfter;
            return this;
        }
        public Builder windowAfter(@Nullable Integer windowAfter) {
            this.windowAfter = Codegen.ofNullable(windowAfter);
            return this;
        }
        public Builder windowBefore(@Nullable Output<Integer> windowBefore) {
            this.windowBefore = windowBefore;
            return this;
        }
        public Builder windowBefore(@Nullable Integer windowBefore) {
            this.windowBefore = Codegen.ofNullable(windowBefore);
            return this;
        }        public PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs(windowAfter, windowBefore);
        }
    }
}
