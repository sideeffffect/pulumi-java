// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResolverRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResolverRuleArgs Empty = new GetResolverRuleArgs();

    /**
     * The domain name the desired resolver rule forwards DNS queries for. Conflicts with `resolver_rule_id`.
     * 
     */
    @Import(name="domainName")
      private final @Nullable String domainName;

    public Optional<String> domainName() {
        return this.domainName == null ? Optional.empty() : Optional.ofNullable(this.domainName);
    }

    /**
     * The friendly name of the desired resolver rule. Conflicts with `resolver_rule_id`.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The ID of the outbound resolver endpoint of the desired resolver rule. Conflicts with `resolver_rule_id`.
     * 
     */
    @Import(name="resolverEndpointId")
      private final @Nullable String resolverEndpointId;

    public Optional<String> resolverEndpointId() {
        return this.resolverEndpointId == null ? Optional.empty() : Optional.ofNullable(this.resolverEndpointId);
    }

    /**
     * The ID of the desired resolver rule. Conflicts with `domain_name`, `name`, `resolver_endpoint_id` and `rule_type`.
     * 
     */
    @Import(name="resolverRuleId")
      private final @Nullable String resolverRuleId;

    public Optional<String> resolverRuleId() {
        return this.resolverRuleId == null ? Optional.empty() : Optional.ofNullable(this.resolverRuleId);
    }

    /**
     * The rule type of the desired resolver rule. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`. Conflicts with `resolver_rule_id`.
     * 
     */
    @Import(name="ruleType")
      private final @Nullable String ruleType;

    public Optional<String> ruleType() {
        return this.ruleType == null ? Optional.empty() : Optional.ofNullable(this.ruleType);
    }

    /**
     * A map of tags assigned to the resolver rule.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetResolverRuleArgs(
        @Nullable String domainName,
        @Nullable String name,
        @Nullable String resolverEndpointId,
        @Nullable String resolverRuleId,
        @Nullable String ruleType,
        @Nullable Map<String,String> tags) {
        this.domainName = domainName;
        this.name = name;
        this.resolverEndpointId = resolverEndpointId;
        this.resolverRuleId = resolverRuleId;
        this.ruleType = ruleType;
        this.tags = tags;
    }

    private GetResolverRuleArgs() {
        this.domainName = null;
        this.name = null;
        this.resolverEndpointId = null;
        this.resolverRuleId = null;
        this.ruleType = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolverRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String domainName;
        private @Nullable String name;
        private @Nullable String resolverEndpointId;
        private @Nullable String resolverRuleId;
        private @Nullable String ruleType;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResolverRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.name = defaults.name;
    	      this.resolverEndpointId = defaults.resolverEndpointId;
    	      this.resolverRuleId = defaults.resolverRuleId;
    	      this.ruleType = defaults.ruleType;
    	      this.tags = defaults.tags;
        }

        public Builder domainName(@Nullable String domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder resolverEndpointId(@Nullable String resolverEndpointId) {
            this.resolverEndpointId = resolverEndpointId;
            return this;
        }
        public Builder resolverRuleId(@Nullable String resolverRuleId) {
            this.resolverRuleId = resolverRuleId;
            return this;
        }
        public Builder ruleType(@Nullable String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetResolverRuleArgs build() {
            return new GetResolverRuleArgs(domainName, name, resolverEndpointId, resolverRuleId, ruleType, tags);
        }
    }
}
