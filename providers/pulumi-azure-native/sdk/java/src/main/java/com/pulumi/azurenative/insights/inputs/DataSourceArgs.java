// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.DataSourceConfigurationArgs;
import com.pulumi.azurenative.insights.inputs.SinkConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Data source object contains configuration to collect telemetry and one or more sinks to send that telemetry data to
 * 
 */
public final class DataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceArgs Empty = new DataSourceArgs();

    @Import(name="configuration", required=true)
      private final Output<DataSourceConfigurationArgs> configuration;

    public Output<DataSourceConfigurationArgs> configuration() {
        return this.configuration;
    }

    /**
     * Datasource kind
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    @Import(name="sinks", required=true)
      private final Output<List<SinkConfigurationArgs>> sinks;

    public Output<List<SinkConfigurationArgs>> sinks() {
        return this.sinks;
    }

    public DataSourceArgs(
        Output<DataSourceConfigurationArgs> configuration,
        Output<String> kind,
        Output<List<SinkConfigurationArgs>> sinks) {
        this.configuration = Objects.requireNonNull(configuration, "expected parameter 'configuration' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.sinks = Objects.requireNonNull(sinks, "expected parameter 'sinks' to be non-null");
    }

    private DataSourceArgs() {
        this.configuration = Codegen.empty();
        this.kind = Codegen.empty();
        this.sinks = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DataSourceConfigurationArgs> configuration;
        private Output<String> kind;
        private Output<List<SinkConfigurationArgs>> sinks;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.kind = defaults.kind;
    	      this.sinks = defaults.sinks;
        }

        public Builder configuration(Output<DataSourceConfigurationArgs> configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }
        public Builder configuration(DataSourceConfigurationArgs configuration) {
            this.configuration = Output.of(Objects.requireNonNull(configuration));
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder sinks(Output<List<SinkConfigurationArgs>> sinks) {
            this.sinks = Objects.requireNonNull(sinks);
            return this;
        }
        public Builder sinks(List<SinkConfigurationArgs> sinks) {
            this.sinks = Output.of(Objects.requireNonNull(sinks));
            return this;
        }
        public Builder sinks(SinkConfigurationArgs... sinks) {
            return sinks(List.of(sinks));
        }        public DataSourceArgs build() {
            return new DataSourceArgs(configuration, kind, sinks);
        }
    }
}
