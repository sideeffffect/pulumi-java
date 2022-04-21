// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * &lt;p&gt;Spark parameters.&lt;/p&gt;
 * 
 */
public final class DataSourceSparkParameters extends com.pulumi.resources.InvokeArgs {

    public static final DataSourceSparkParameters Empty = new DataSourceSparkParameters();

    /**
     * &lt;p&gt;Host.&lt;/p&gt;
     * 
     */
    @Import(name="host", required=true)
    private String host;

    public String host() {
        return this.host;
    }

    /**
     * &lt;p&gt;Port.&lt;/p&gt;
     * 
     */
    @Import(name="port", required=true)
    private Double port;

    public Double port() {
        return this.port;
    }

    private DataSourceSparkParameters() {}

    private DataSourceSparkParameters(DataSourceSparkParameters $) {
        this.host = $.host;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceSparkParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceSparkParameters $;

        public Builder() {
            $ = new DataSourceSparkParameters();
        }

        public Builder(DataSourceSparkParameters defaults) {
            $ = new DataSourceSparkParameters(Objects.requireNonNull(defaults));
        }

        public Builder host(String host) {
            $.host = host;
            return this;
        }

        public Builder port(Double port) {
            $.port = port;
            return this;
        }

        public DataSourceSparkParameters build() {
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
