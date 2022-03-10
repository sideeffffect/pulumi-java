// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetLocalGatewayVirtualInterfaceGroupFilter {
    /**
     * Name of the filter.
     * 
     */
    private final String name;
    /**
     * List of one or more values for the filter.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor
    private GetLocalGatewayVirtualInterfaceGroupFilter(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("values") List<String> values) {
        this.name = name;
        this.values = values;
    }

    /**
     * Name of the filter.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * List of one or more values for the filter.
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayVirtualInterfaceGroupFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalGatewayVirtualInterfaceGroupFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public GetLocalGatewayVirtualInterfaceGroupFilter build() {
            return new GetLocalGatewayVirtualInterfaceGroupFilter(name, values);
        }
    }
}
