// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * HDFS Name Node IP and port information.
 * 
 */
public final class LocationHDFSNameNodeArgs extends ResourceArgs {

    public static final LocationHDFSNameNodeArgs Empty = new LocationHDFSNameNodeArgs();

    /**
     * The DNS name or IP address of the Name Node in the customer&#39;s on premises HDFS cluster.
     * 
     */
    @Import(name="hostname", required=true)
    private Output<String> hostname;

    /**
     * @return The DNS name or IP address of the Name Node in the customer&#39;s on premises HDFS cluster.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }

    /**
     * The port on which the Name Node is listening on for client requests.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port on which the Name Node is listening on for client requests.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    private LocationHDFSNameNodeArgs() {}

    private LocationHDFSNameNodeArgs(LocationHDFSNameNodeArgs $) {
        this.hostname = $.hostname;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationHDFSNameNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationHDFSNameNodeArgs $;

        public Builder() {
            $ = new LocationHDFSNameNodeArgs();
        }

        public Builder(LocationHDFSNameNodeArgs defaults) {
            $ = new LocationHDFSNameNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostname The DNS name or IP address of the Name Node in the customer&#39;s on premises HDFS cluster.
         * 
         * @return builder
         * 
         */
        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The DNS name or IP address of the Name Node in the customer&#39;s on premises HDFS cluster.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param port The port on which the Name Node is listening on for client requests.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port on which the Name Node is listening on for client requests.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public LocationHDFSNameNodeArgs build() {
            $.hostname = Objects.requireNonNull($.hostname, "expected parameter 'hostname' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
