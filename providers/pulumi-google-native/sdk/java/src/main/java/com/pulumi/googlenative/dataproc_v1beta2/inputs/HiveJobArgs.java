// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.QueryListArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Dataproc job for running Apache Hive (https://hive.apache.org/) queries on YARN.
 * 
 */
public final class HiveJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final HiveJobArgs Empty = new HiveJobArgs();

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
     * 
     */
    @Import(name="continueOnFailure")
    private @Nullable Output<Boolean> continueOnFailure;

    public Optional<Output<Boolean>> continueOnFailure() {
        return Optional.ofNullable(this.continueOnFailure);
    }

    /**
     * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Hive server and Hadoop MapReduce (MR) tasks. Can contain Hive SerDes and UDFs.
     * 
     */
    @Import(name="jarFileUris")
    private @Nullable Output<List<String>> jarFileUris;

    public Optional<Output<List<String>>> jarFileUris() {
        return Optional.ofNullable(this.jarFileUris);
    }

    /**
     * Optional. A mapping of property names and values, used to configure Hive. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site.xml, /etc/hive/conf/hive-site.xml, and classes in user code.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The HCFS URI of the script that contains Hive queries.
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
    private @Nullable Output<QueryListArgs> queryList;

    public Optional<Output<QueryListArgs>> queryList() {
        return Optional.ofNullable(this.queryList);
    }

    /**
     * Optional. Mapping of query variable names to values (equivalent to the Hive command: SET name=&#34;value&#34;;).
     * 
     */
    @Import(name="scriptVariables")
    private @Nullable Output<Map<String,String>> scriptVariables;

    public Optional<Output<Map<String,String>>> scriptVariables() {
        return Optional.ofNullable(this.scriptVariables);
    }

    private HiveJobArgs() {}

    private HiveJobArgs(HiveJobArgs $) {
        this.continueOnFailure = $.continueOnFailure;
        this.jarFileUris = $.jarFileUris;
        this.properties = $.properties;
        this.queryFileUri = $.queryFileUri;
        this.queryList = $.queryList;
        this.scriptVariables = $.scriptVariables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HiveJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HiveJobArgs $;

        public Builder() {
            $ = new HiveJobArgs();
        }

        public Builder(HiveJobArgs defaults) {
            $ = new HiveJobArgs(Objects.requireNonNull(defaults));
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

        public Builder queryList(@Nullable Output<QueryListArgs> queryList) {
            $.queryList = queryList;
            return this;
        }

        public Builder queryList(QueryListArgs queryList) {
            return queryList(Output.of(queryList));
        }

        public Builder scriptVariables(@Nullable Output<Map<String,String>> scriptVariables) {
            $.scriptVariables = scriptVariables;
            return this;
        }

        public Builder scriptVariables(Map<String,String> scriptVariables) {
            return scriptVariables(Output.of(scriptVariables));
        }

        public HiveJobArgs build() {
            return $;
        }
    }

}
