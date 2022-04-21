// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A rule metric data source. The discriminator value is always RuleMetricDataSource in this case.
 * 
 */
public final class RuleMetricDataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleMetricDataSourceArgs Empty = new RuleMetricDataSourceArgs();

    /**
     * the legacy resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
     */
    @Import(name="legacyResourceId")
    private @Nullable Output<String> legacyResourceId;

    public Optional<Output<String>> legacyResourceId() {
        return Optional.ofNullable(this.legacyResourceId);
    }

    /**
     * the name of the metric that defines what the rule monitors.
     * 
     */
    @Import(name="metricName")
    private @Nullable Output<String> metricName;

    public Optional<Output<String>> metricName() {
        return Optional.ofNullable(this.metricName);
    }

    /**
     * the namespace of the metric.
     * 
     */
    @Import(name="metricNamespace")
    private @Nullable Output<String> metricNamespace;

    public Optional<Output<String>> metricNamespace() {
        return Optional.ofNullable(this.metricNamespace);
    }

    /**
     * specifies the type of data source. There are two types of rule data sources: RuleMetricDataSource and RuleManagementEventDataSource
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.RuleMetricDataSource&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * the location of the resource.
     * 
     */
    @Import(name="resourceLocation")
    private @Nullable Output<String> resourceLocation;

    public Optional<Output<String>> resourceLocation() {
        return Optional.ofNullable(this.resourceLocation);
    }

    /**
     * the resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
     */
    @Import(name="resourceUri")
    private @Nullable Output<String> resourceUri;

    public Optional<Output<String>> resourceUri() {
        return Optional.ofNullable(this.resourceUri);
    }

    private RuleMetricDataSourceArgs() {}

    private RuleMetricDataSourceArgs(RuleMetricDataSourceArgs $) {
        this.legacyResourceId = $.legacyResourceId;
        this.metricName = $.metricName;
        this.metricNamespace = $.metricNamespace;
        this.odataType = $.odataType;
        this.resourceLocation = $.resourceLocation;
        this.resourceUri = $.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleMetricDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleMetricDataSourceArgs $;

        public Builder() {
            $ = new RuleMetricDataSourceArgs();
        }

        public Builder(RuleMetricDataSourceArgs defaults) {
            $ = new RuleMetricDataSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder legacyResourceId(@Nullable Output<String> legacyResourceId) {
            $.legacyResourceId = legacyResourceId;
            return this;
        }

        public Builder legacyResourceId(String legacyResourceId) {
            return legacyResourceId(Output.of(legacyResourceId));
        }

        public Builder metricName(@Nullable Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        public Builder metricNamespace(@Nullable Output<String> metricNamespace) {
            $.metricNamespace = metricNamespace;
            return this;
        }

        public Builder metricNamespace(String metricNamespace) {
            return metricNamespace(Output.of(metricNamespace));
        }

        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public Builder resourceLocation(@Nullable Output<String> resourceLocation) {
            $.resourceLocation = resourceLocation;
            return this;
        }

        public Builder resourceLocation(String resourceLocation) {
            return resourceLocation(Output.of(resourceLocation));
        }

        public Builder resourceUri(@Nullable Output<String> resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        public Builder resourceUri(String resourceUri) {
            return resourceUri(Output.of(resourceUri));
        }

        public RuleMetricDataSourceArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
