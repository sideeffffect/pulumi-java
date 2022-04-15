// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersSparkGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersSparkGetArgs Empty = new DataSourceParametersSparkGetArgs();

    /**
     * The host to which to connect.
     * 
     */
    @Import(name="host", required=true)
      private final Output<String> host;

    public Output<String> host() {
        return this.host;
    }

    /**
     * The warehouse to which to connect.
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    public DataSourceParametersSparkGetArgs(
        Output<String> host,
        Output<Integer> port) {
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private DataSourceParametersSparkGetArgs() {
        this.host = Codegen.empty();
        this.port = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersSparkGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> host;
        private Output<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersSparkGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder host(Output<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder host(String host) {
            this.host = Output.of(Objects.requireNonNull(host));
            return this;
        }
        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }        public DataSourceParametersSparkGetArgs build() {
            return new DataSourceParametersSparkGetArgs(host, port);
        }
    }
}
