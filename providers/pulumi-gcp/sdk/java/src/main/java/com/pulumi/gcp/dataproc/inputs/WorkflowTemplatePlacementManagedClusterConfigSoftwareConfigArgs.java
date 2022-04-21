// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs();

    /**
     * Optional. The version of software inside the cluster. It must be one of the supported (https://cloud.google.com/dataproc/docs/concepts/versioning/dataproc-versions#other_versions). If unspecified, it defaults to the latest Debian version.
     * 
     */
    @Import(name="imageVersion")
    private @Nullable Output<String> imageVersion;

    public Optional<Output<String>> imageVersion() {
        return Optional.ofNullable(this.imageVersion);
    }

    @Import(name="optionalComponents")
    private @Nullable Output<List<String>> optionalComponents;

    public Optional<Output<List<String>>> optionalComponents() {
        return Optional.ofNullable(this.optionalComponents);
    }

    /**
     * Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs() {}

    private WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs(WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs $) {
        this.imageVersion = $.imageVersion;
        this.optionalComponents = $.optionalComponents;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs $;

        public Builder() {
            $ = new WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs();
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs defaults) {
            $ = new WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder imageVersion(@Nullable Output<String> imageVersion) {
            $.imageVersion = imageVersion;
            return this;
        }

        public Builder imageVersion(String imageVersion) {
            return imageVersion(Output.of(imageVersion));
        }

        public Builder optionalComponents(@Nullable Output<List<String>> optionalComponents) {
            $.optionalComponents = optionalComponents;
            return this;
        }

        public Builder optionalComponents(List<String> optionalComponents) {
            return optionalComponents(Output.of(optionalComponents));
        }

        public Builder optionalComponents(String... optionalComponents) {
            return optionalComponents(List.of(optionalComponents));
        }

        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        public WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs build() {
            return $;
        }
    }

}
