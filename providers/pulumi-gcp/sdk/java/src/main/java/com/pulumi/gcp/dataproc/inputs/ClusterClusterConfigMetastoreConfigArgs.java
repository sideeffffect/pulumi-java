// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class ClusterClusterConfigMetastoreConfigArgs extends ResourceArgs {

    public static final ClusterClusterConfigMetastoreConfigArgs Empty = new ClusterClusterConfigMetastoreConfigArgs();

    /**
     * Resource name of an existing Dataproc Metastore service.
     * 
     */
    @Import(name="dataprocMetastoreService", required=true)
    private Output<String> dataprocMetastoreService;

    /**
     * @return Resource name of an existing Dataproc Metastore service.
     * 
     */
    public Output<String> dataprocMetastoreService() {
        return this.dataprocMetastoreService;
    }

    private ClusterClusterConfigMetastoreConfigArgs() {}

    private ClusterClusterConfigMetastoreConfigArgs(ClusterClusterConfigMetastoreConfigArgs $) {
        this.dataprocMetastoreService = $.dataprocMetastoreService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterConfigMetastoreConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterConfigMetastoreConfigArgs $;

        public Builder() {
            $ = new ClusterClusterConfigMetastoreConfigArgs();
        }

        public Builder(ClusterClusterConfigMetastoreConfigArgs defaults) {
            $ = new ClusterClusterConfigMetastoreConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataprocMetastoreService Resource name of an existing Dataproc Metastore service.
         * 
         * @return builder
         * 
         */
        public Builder dataprocMetastoreService(Output<String> dataprocMetastoreService) {
            $.dataprocMetastoreService = dataprocMetastoreService;
            return this;
        }

        /**
         * @param dataprocMetastoreService Resource name of an existing Dataproc Metastore service.
         * 
         * @return builder
         * 
         */
        public Builder dataprocMetastoreService(String dataprocMetastoreService) {
            return dataprocMetastoreService(Output.of(dataprocMetastoreService));
        }

        public ClusterClusterConfigMetastoreConfigArgs build() {
            $.dataprocMetastoreService = Objects.requireNonNull($.dataprocMetastoreService, "expected parameter 'dataprocMetastoreService' to be non-null");
            return $;
        }
    }

}
