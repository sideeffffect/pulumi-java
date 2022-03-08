// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TopicRuleElasticsearchAction {
    private final String endpoint;
    private final String id;
    private final String index;
    private final String roleArn;
    private final String type;

    @OutputCustomType.Constructor({"endpoint","id","index","roleArn","type"})
    private TopicRuleElasticsearchAction(
        String endpoint,
        String id,
        String index,
        String roleArn,
        String type) {
        this.endpoint = endpoint;
        this.id = id;
        this.index = index;
        this.roleArn = roleArn;
        this.type = type;
    }

    public String getEndpoint() {
        return this.endpoint;
    }
    public String getId() {
        return this.id;
    }
    public String getIndex() {
        return this.index;
    }
    public String getRoleArn() {
        return this.roleArn;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleElasticsearchAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private String id;
        private String index;
        private String roleArn;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleElasticsearchAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.index = defaults.index;
    	      this.roleArn = defaults.roleArn;
    	      this.type = defaults.type;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIndex(String index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TopicRuleElasticsearchAction build() {
            return new TopicRuleElasticsearchAction(endpoint, id, index, roleArn, type);
        }
    }
}
