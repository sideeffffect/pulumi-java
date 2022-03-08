// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TaskDefinitionResourceRequirement {
    private final String type;
    private final String value;

    @OutputCustomType.Constructor({"type","value"})
    private TaskDefinitionResourceRequirement(
        String type,
        String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return this.type;
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionResourceRequirement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionResourceRequirement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public TaskDefinitionResourceRequirement build() {
            return new TaskDefinitionResourceRequirement(type, value);
        }
    }
}
