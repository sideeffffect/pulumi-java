// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ClusterSetting {
    /**
     * Name of the setting to manage. Valid values: `containerInsights`.
     * 
     */
    private final String name;
    /**
     * The value to assign to the setting. Value values are `enabled` and `disabled`.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private ClusterSetting(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Name of the setting to manage. Valid values: `containerInsights`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The value to assign to the setting. Value values are `enabled` and `disabled`.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ClusterSetting build() {
            return new ClusterSetting(name, value);
        }
    }
}
