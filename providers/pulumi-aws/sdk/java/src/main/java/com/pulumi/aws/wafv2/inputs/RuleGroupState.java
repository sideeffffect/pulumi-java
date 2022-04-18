// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupCustomResponseBodyGetArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleGetArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupVisibilityConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupState extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupState Empty = new RuleGroupState();

    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The web ACL capacity units (WCUs) required for this rule group. See [here](https://docs.aws.amazon.com/waf/latest/APIReference/API_CreateRuleGroup.html#API_CreateRuleGroup_RequestSyntax) for general information and [here](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statements-list.html) for capacity specific information.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<Integer> capacity;

    public Output<Integer> capacity() {
        return this.capacity == null ? Codegen.empty() : this.capacity;
    }

    /**
     * Defines custom response bodies that can be referenced by `custom_response` actions. See Custom Response Body below for details.
     * 
     */
    @Import(name="customResponseBodies")
      private final @Nullable Output<List<RuleGroupCustomResponseBodyGetArgs>> customResponseBodies;

    public Output<List<RuleGroupCustomResponseBodyGetArgs>> customResponseBodies() {
        return this.customResponseBodies == null ? Codegen.empty() : this.customResponseBodies;
    }

    /**
     * A friendly description of the rule group.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="lockToken")
      private final @Nullable Output<String> lockToken;

    public Output<String> lockToken() {
        return this.lockToken == null ? Codegen.empty() : this.lockToken;
    }

    /**
     * The label string.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<RuleGroupRuleGetArgs>> rules;

    public Output<List<RuleGroupRuleGetArgs>> rules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<String> scope;

    public Output<String> scope() {
        return this.scope == null ? Codegen.empty() : this.scope;
    }

    /**
     * An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    @Import(name="visibilityConfig")
      private final @Nullable Output<RuleGroupVisibilityConfigGetArgs> visibilityConfig;

    public Output<RuleGroupVisibilityConfigGetArgs> visibilityConfig() {
        return this.visibilityConfig == null ? Codegen.empty() : this.visibilityConfig;
    }

    public RuleGroupState(
        @Nullable Output<String> arn,
        @Nullable Output<Integer> capacity,
        @Nullable Output<List<RuleGroupCustomResponseBodyGetArgs>> customResponseBodies,
        @Nullable Output<String> description,
        @Nullable Output<String> lockToken,
        @Nullable Output<String> name,
        @Nullable Output<List<RuleGroupRuleGetArgs>> rules,
        @Nullable Output<String> scope,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<RuleGroupVisibilityConfigGetArgs> visibilityConfig) {
        this.arn = arn;
        this.capacity = capacity;
        this.customResponseBodies = customResponseBodies;
        this.description = description;
        this.lockToken = lockToken;
        this.name = name;
        this.rules = rules;
        this.scope = scope;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.visibilityConfig = visibilityConfig;
    }

    private RuleGroupState() {
        this.arn = Codegen.empty();
        this.capacity = Codegen.empty();
        this.customResponseBodies = Codegen.empty();
        this.description = Codegen.empty();
        this.lockToken = Codegen.empty();
        this.name = Codegen.empty();
        this.rules = Codegen.empty();
        this.scope = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.visibilityConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Integer> capacity;
        private @Nullable Output<List<RuleGroupCustomResponseBodyGetArgs>> customResponseBodies;
        private @Nullable Output<String> description;
        private @Nullable Output<String> lockToken;
        private @Nullable Output<String> name;
        private @Nullable Output<List<RuleGroupRuleGetArgs>> rules;
        private @Nullable Output<String> scope;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<RuleGroupVisibilityConfigGetArgs> visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.capacity = defaults.capacity;
    	      this.customResponseBodies = defaults.customResponseBodies;
    	      this.description = defaults.description;
    	      this.lockToken = defaults.lockToken;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder capacity(@Nullable Output<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = Codegen.ofNullable(capacity);
            return this;
        }
        public Builder customResponseBodies(@Nullable Output<List<RuleGroupCustomResponseBodyGetArgs>> customResponseBodies) {
            this.customResponseBodies = customResponseBodies;
            return this;
        }
        public Builder customResponseBodies(@Nullable List<RuleGroupCustomResponseBodyGetArgs> customResponseBodies) {
            this.customResponseBodies = Codegen.ofNullable(customResponseBodies);
            return this;
        }
        public Builder customResponseBodies(RuleGroupCustomResponseBodyGetArgs... customResponseBodies) {
            return customResponseBodies(List.of(customResponseBodies));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder lockToken(@Nullable Output<String> lockToken) {
            this.lockToken = lockToken;
            return this;
        }
        public Builder lockToken(@Nullable String lockToken) {
            this.lockToken = Codegen.ofNullable(lockToken);
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
        public Builder rules(@Nullable Output<List<RuleGroupRuleGetArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<RuleGroupRuleGetArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(RuleGroupRuleGetArgs... rules) {
            return rules(List.of(rules));
        }
        public Builder scope(@Nullable Output<String> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = Codegen.ofNullable(scope);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder visibilityConfig(@Nullable Output<RuleGroupVisibilityConfigGetArgs> visibilityConfig) {
            this.visibilityConfig = visibilityConfig;
            return this;
        }
        public Builder visibilityConfig(@Nullable RuleGroupVisibilityConfigGetArgs visibilityConfig) {
            this.visibilityConfig = Codegen.ofNullable(visibilityConfig);
            return this;
        }        public RuleGroupState build() {
            return new RuleGroupState(arn, capacity, customResponseBodies, description, lockToken, name, rules, scope, tags, tagsAll, visibilityConfig);
        }
    }
}
