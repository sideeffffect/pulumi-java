// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetRuleGroupResult {
    /**
     * The Amazon Resource Name (ARN) of the entity.
     * 
     */
    private final String arn;
    /**
     * The description of the rule group that helps with identification.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String scope;

    @OutputCustomType.Constructor
    private GetRuleGroupResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("scope") String scope) {
        this.arn = arn;
        this.description = description;
        this.id = id;
        this.name = name;
        this.scope = scope;
    }

    /**
     * The Amazon Resource Name (ARN) of the entity.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The description of the rule group that helps with identification.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getScope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String description;
        private String id;
        private String name;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRuleGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public GetRuleGroupResult build() {
            return new GetRuleGroupResult(arn, description, id, name, scope);
        }
    }
}
