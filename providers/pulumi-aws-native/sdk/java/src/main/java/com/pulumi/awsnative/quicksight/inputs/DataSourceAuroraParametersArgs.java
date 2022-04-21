// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * &lt;p&gt;Amazon Aurora parameters.&lt;/p&gt;
 * 
 */
public final class DataSourceAuroraParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceAuroraParametersArgs Empty = new DataSourceAuroraParametersArgs();

    /**
     * &lt;p&gt;Database.&lt;/p&gt;
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    public Output<String> database() {
        return this.database;
    }

    /**
     * &lt;p&gt;Host.&lt;/p&gt;
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    public Output<String> host() {
        return this.host;
    }

    /**
     * &lt;p&gt;Port.&lt;/p&gt;
     * 
     */
    @Import(name="port", required=true)
    private Output<Double> port;

    public Output<Double> port() {
        return this.port;
    }

    private DataSourceAuroraParametersArgs() {}

    private DataSourceAuroraParametersArgs(DataSourceAuroraParametersArgs $) {
        this.database = $.database;
        this.host = $.host;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceAuroraParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceAuroraParametersArgs $;

        public Builder() {
            $ = new DataSourceAuroraParametersArgs();
        }

        public Builder(DataSourceAuroraParametersArgs defaults) {
            $ = new DataSourceAuroraParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        public Builder database(String database) {
            return database(Output.of(database));
        }

        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder port(Output<Double> port) {
            $.port = port;
            return this;
        }

        public Builder port(Double port) {
            return port(Output.of(port));
        }

        public DataSourceAuroraParametersArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
