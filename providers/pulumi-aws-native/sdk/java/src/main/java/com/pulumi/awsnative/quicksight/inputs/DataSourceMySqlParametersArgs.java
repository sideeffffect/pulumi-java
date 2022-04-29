// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * &lt;p&gt;MySQL parameters.&lt;/p&gt;
 * 
 */
public final class DataSourceMySqlParametersArgs extends ResourceArgs {

    public static final DataSourceMySqlParametersArgs Empty = new DataSourceMySqlParametersArgs();

    /**
     * &lt;p&gt;Database.&lt;/p&gt;
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return &lt;p&gt;Database.&lt;/p&gt;
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * &lt;p&gt;Host.&lt;/p&gt;
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return &lt;p&gt;Host.&lt;/p&gt;
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * &lt;p&gt;Port.&lt;/p&gt;
     * 
     */
    @Import(name="port", required=true)
    private Output<Double> port;

    /**
     * @return &lt;p&gt;Port.&lt;/p&gt;
     * 
     */
    public Output<Double> port() {
        return this.port;
    }

    private DataSourceMySqlParametersArgs() {}

    private DataSourceMySqlParametersArgs(DataSourceMySqlParametersArgs $) {
        this.database = $.database;
        this.host = $.host;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceMySqlParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceMySqlParametersArgs $;

        public Builder() {
            $ = new DataSourceMySqlParametersArgs();
        }

        public Builder(DataSourceMySqlParametersArgs defaults) {
            $ = new DataSourceMySqlParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database &lt;p&gt;Database.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database &lt;p&gt;Database.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param host &lt;p&gt;Host.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host &lt;p&gt;Host.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param port &lt;p&gt;Port.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Double> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port &lt;p&gt;Port.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder port(Double port) {
            return port(Output.of(port));
        }

        public DataSourceMySqlParametersArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
