// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DatasetIotEventsDestinationConfiguration {
    private final String inputName;
    private final String roleArn;

    @OutputCustomType.Constructor
    private DatasetIotEventsDestinationConfiguration(
        @OutputCustomType.Parameter("inputName") String inputName,
        @OutputCustomType.Parameter("roleArn") String roleArn) {
        this.inputName = inputName;
        this.roleArn = roleArn;
    }

    public String getInputName() {
        return this.inputName;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetIotEventsDestinationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inputName;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetIotEventsDestinationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputName = defaults.inputName;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder inputName(String inputName) {
            this.inputName = Objects.requireNonNull(inputName);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public DatasetIotEventsDestinationConfiguration build() {
            return new DatasetIotEventsDestinationConfiguration(inputName, roleArn);
        }
    }
}
