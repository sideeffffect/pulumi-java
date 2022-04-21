// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPigJobLoggingConfigGetArgs;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPigJobQueryListGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobPigJobGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobPigJobGetArgs Empty = new WorkflowTemplateJobPigJobGetArgs();

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is `false`. Setting to `true` can be useful when executing independent parallel queries.
     * 
     */
    @Import(name="continueOnFailure")
    private @Nullable Output<Boolean> continueOnFailure;

    public Optional<Output<Boolean>> continueOnFailure() {
        return Optional.ofNullable(this.continueOnFailure);
    }

    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    @Import(name="jarFileUris")
    private @Nullable Output<List<String>> jarFileUris;

    public Optional<Output<List<String>>> jarFileUris() {
        return Optional.ofNullable(this.jarFileUris);
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig")
    private @Nullable Output<WorkflowTemplateJobPigJobLoggingConfigGetArgs> loggingConfig;

    public Optional<Output<WorkflowTemplateJobPigJobLoggingConfigGetArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
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

    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    @Import(name="queryFileUri")
    private @Nullable Output<String> queryFileUri;

    public Optional<Output<String>> queryFileUri() {
        return Optional.ofNullable(this.queryFileUri);
    }

    /**
     * A list of queries.
     * 
     */
    @Import(name="queryList")
    private @Nullable Output<WorkflowTemplateJobPigJobQueryListGetArgs> queryList;

    public Optional<Output<WorkflowTemplateJobPigJobQueryListGetArgs>> queryList() {
        return Optional.ofNullable(this.queryList);
    }

    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET `name=&#34;value&#34;;`).
     * 
     */
    @Import(name="scriptVariables")
    private @Nullable Output<Map<String,String>> scriptVariables;

    public Optional<Output<Map<String,String>>> scriptVariables() {
        return Optional.ofNullable(this.scriptVariables);
    }

    private WorkflowTemplateJobPigJobGetArgs() {}

    private WorkflowTemplateJobPigJobGetArgs(WorkflowTemplateJobPigJobGetArgs $) {
        this.continueOnFailure = $.continueOnFailure;
        this.jarFileUris = $.jarFileUris;
        this.loggingConfig = $.loggingConfig;
        this.properties = $.properties;
        this.queryFileUri = $.queryFileUri;
        this.queryList = $.queryList;
        this.scriptVariables = $.scriptVariables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplateJobPigJobGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplateJobPigJobGetArgs $;

        public Builder() {
            $ = new WorkflowTemplateJobPigJobGetArgs();
        }

        public Builder(WorkflowTemplateJobPigJobGetArgs defaults) {
            $ = new WorkflowTemplateJobPigJobGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder continueOnFailure(@Nullable Output<Boolean> continueOnFailure) {
            $.continueOnFailure = continueOnFailure;
            return this;
        }

        public Builder continueOnFailure(Boolean continueOnFailure) {
            return continueOnFailure(Output.of(continueOnFailure));
        }

        public Builder jarFileUris(@Nullable Output<List<String>> jarFileUris) {
            $.jarFileUris = jarFileUris;
            return this;
        }

        public Builder jarFileUris(List<String> jarFileUris) {
            return jarFileUris(Output.of(jarFileUris));
        }

        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }

        public Builder loggingConfig(@Nullable Output<WorkflowTemplateJobPigJobLoggingConfigGetArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        public Builder loggingConfig(WorkflowTemplateJobPigJobLoggingConfigGetArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        public Builder queryFileUri(@Nullable Output<String> queryFileUri) {
            $.queryFileUri = queryFileUri;
            return this;
        }

        public Builder queryFileUri(String queryFileUri) {
            return queryFileUri(Output.of(queryFileUri));
        }

        public Builder queryList(@Nullable Output<WorkflowTemplateJobPigJobQueryListGetArgs> queryList) {
            $.queryList = queryList;
            return this;
        }

        public Builder queryList(WorkflowTemplateJobPigJobQueryListGetArgs queryList) {
            return queryList(Output.of(queryList));
        }

        public Builder scriptVariables(@Nullable Output<Map<String,String>> scriptVariables) {
            $.scriptVariables = scriptVariables;
            return this;
        }

        public Builder scriptVariables(Map<String,String> scriptVariables) {
            return scriptVariables(Output.of(scriptVariables));
        }

        public WorkflowTemplateJobPigJobGetArgs build() {
            return $;
        }
    }

}
