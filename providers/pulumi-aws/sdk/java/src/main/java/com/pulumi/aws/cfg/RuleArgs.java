// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg;

import com.pulumi.aws.cfg.inputs.RuleScopeArgs;
import com.pulumi.aws.cfg.inputs.RuleSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

    /**
     * Description of the rule
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A string in JSON format that is passed to the AWS Config rule Lambda function.
     * 
     */
    @Import(name="inputParameters")
      private final @Nullable Output<String> inputParameters;

    public Output<String> inputParameters() {
        return this.inputParameters == null ? Codegen.empty() : this.inputParameters;
    }

    /**
     * The frequency that you want AWS Config to run evaluations for a rule that is triggered periodically. If specified, requires `message_type` to be `ScheduledNotification`.
     * 
     */
    @Import(name="maximumExecutionFrequency")
      private final @Nullable Output<String> maximumExecutionFrequency;

    public Output<String> maximumExecutionFrequency() {
        return this.maximumExecutionFrequency == null ? Codegen.empty() : this.maximumExecutionFrequency;
    }

    /**
     * The name of the rule
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Scope defines which resources can trigger an evaluation for the rule as documented below.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<RuleScopeArgs> scope;

    public Output<RuleScopeArgs> scope() {
        return this.scope == null ? Codegen.empty() : this.scope;
    }

    /**
     * Source specifies the rule owner, the rule identifier, and the notifications that cause the function to evaluate your AWS resources as documented below.
     * 
     */
    @Import(name="source", required=true)
      private final Output<RuleSourceArgs> source;

    public Output<RuleSourceArgs> source() {
        return this.source;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public RuleArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> inputParameters,
        @Nullable Output<String> maximumExecutionFrequency,
        @Nullable Output<String> name,
        @Nullable Output<RuleScopeArgs> scope,
        Output<RuleSourceArgs> source,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.inputParameters = inputParameters;
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        this.name = name;
        this.scope = scope;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.tags = tags;
    }

    private RuleArgs() {
        this.description = Codegen.empty();
        this.inputParameters = Codegen.empty();
        this.maximumExecutionFrequency = Codegen.empty();
        this.name = Codegen.empty();
        this.scope = Codegen.empty();
        this.source = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> inputParameters;
        private @Nullable Output<String> maximumExecutionFrequency;
        private @Nullable Output<String> name;
        private @Nullable Output<RuleScopeArgs> scope;
        private Output<RuleSourceArgs> source;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.inputParameters = defaults.inputParameters;
    	      this.maximumExecutionFrequency = defaults.maximumExecutionFrequency;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder inputParameters(@Nullable Output<String> inputParameters) {
            this.inputParameters = inputParameters;
            return this;
        }
        public Builder inputParameters(@Nullable String inputParameters) {
            this.inputParameters = Codegen.ofNullable(inputParameters);
            return this;
        }
        public Builder maximumExecutionFrequency(@Nullable Output<String> maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public Builder maximumExecutionFrequency(@Nullable String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = Codegen.ofNullable(maximumExecutionFrequency);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder scope(@Nullable Output<RuleScopeArgs> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable RuleScopeArgs scope) {
            this.scope = Codegen.ofNullable(scope);
            return this;
        }
        public Builder source(Output<RuleSourceArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder source(RuleSourceArgs source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public RuleArgs build() {
            return new RuleArgs(description, inputParameters, maximumExecutionFrequency, name, scope, source, tags);
        }
    }
}
