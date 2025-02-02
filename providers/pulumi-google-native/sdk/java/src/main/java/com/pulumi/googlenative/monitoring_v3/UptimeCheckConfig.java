// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.monitoring_v3.UptimeCheckConfigArgs;
import com.pulumi.googlenative.monitoring_v3.outputs.ContentMatcherResponse;
import com.pulumi.googlenative.monitoring_v3.outputs.HttpCheckResponse;
import com.pulumi.googlenative.monitoring_v3.outputs.InternalCheckerResponse;
import com.pulumi.googlenative.monitoring_v3.outputs.MonitoredResourceResponse;
import com.pulumi.googlenative.monitoring_v3.outputs.ResourceGroupResponse;
import com.pulumi.googlenative.monitoring_v3.outputs.TcpCheckResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new Uptime check configuration.
 * 
 */
@ResourceType(type="google-native:monitoring/v3:UptimeCheckConfig")
public class UptimeCheckConfig extends com.pulumi.resources.CustomResource {
    /**
     * The type of checkers to use to execute the Uptime check.
     * 
     */
    @Export(name="checkerType", type=String.class, parameters={})
    private Output<String> checkerType;

    /**
     * @return The type of checkers to use to execute the Uptime check.
     * 
     */
    public Output<String> checkerType() {
        return this.checkerType;
    }
    /**
     * The content that is expected to appear in the data returned by the target server against which the check is run. Currently, only the first entry in the content_matchers list is supported, and additional entries will be ignored. This field is optional and should only be specified if a content match is required as part of the/ Uptime check.
     * 
     */
    @Export(name="contentMatchers", type=List.class, parameters={ContentMatcherResponse.class})
    private Output<List<ContentMatcherResponse>> contentMatchers;

    /**
     * @return The content that is expected to appear in the data returned by the target server against which the check is run. Currently, only the first entry in the content_matchers list is supported, and additional entries will be ignored. This field is optional and should only be specified if a content match is required as part of the/ Uptime check.
     * 
     */
    public Output<List<ContentMatcherResponse>> contentMatchers() {
        return this.contentMatchers;
    }
    /**
     * A human-friendly name for the Uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced. Required.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A human-friendly name for the Uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced. Required.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Contains information needed to make an HTTP or HTTPS check.
     * 
     */
    @Export(name="httpCheck", type=HttpCheckResponse.class, parameters={})
    private Output<HttpCheckResponse> httpCheck;

    /**
     * @return Contains information needed to make an HTTP or HTTPS check.
     * 
     */
    public Output<HttpCheckResponse> httpCheck() {
        return this.httpCheck;
    }
    /**
     * The internal checkers that this check will egress from. If is_internal is true and this list is empty, the check will egress from all the InternalCheckers configured for the project that owns this UptimeCheckConfig.
     * 
     */
    @Export(name="internalCheckers", type=List.class, parameters={InternalCheckerResponse.class})
    private Output<List<InternalCheckerResponse>> internalCheckers;

    /**
     * @return The internal checkers that this check will egress from. If is_internal is true and this list is empty, the check will egress from all the InternalCheckers configured for the project that owns this UptimeCheckConfig.
     * 
     */
    public Output<List<InternalCheckerResponse>> internalCheckers() {
        return this.internalCheckers;
    }
    /**
     * If this is true, then checks are made only from the &#39;internal_checkers&#39;. If it is false, then checks are made only from the &#39;selected_regions&#39;. It is an error to provide &#39;selected_regions&#39; when is_internal is true, or to provide &#39;internal_checkers&#39; when is_internal is false.
     * 
     */
    @Export(name="isInternal", type=Boolean.class, parameters={})
    private Output<Boolean> isInternal;

    /**
     * @return If this is true, then checks are made only from the &#39;internal_checkers&#39;. If it is false, then checks are made only from the &#39;selected_regions&#39;. It is an error to provide &#39;selected_regions&#39; when is_internal is true, or to provide &#39;internal_checkers&#39; when is_internal is false.
     * 
     */
    public Output<Boolean> isInternal() {
        return this.isInternal;
    }
    /**
     * The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are valid for this field: uptime_url, gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer k8s_service servicedirectory_service
     * 
     */
    @Export(name="monitoredResource", type=MonitoredResourceResponse.class, parameters={})
    private Output<MonitoredResourceResponse> monitoredResource;

    /**
     * @return The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are valid for this field: uptime_url, gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer k8s_service servicedirectory_service
     * 
     */
    public Output<MonitoredResourceResponse> monitoredResource() {
        return this.monitoredResource;
    }
    /**
     * A unique resource name for this Uptime check configuration. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is the Workspace host project associated with the Uptime check.This field should be omitted when creating the Uptime check configuration; on create, the resource name is assigned by the server and included in the response.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique resource name for this Uptime check configuration. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is the Workspace host project associated with the Uptime check.This field should be omitted when creating the Uptime check configuration; on create, the resource name is assigned by the server and included in the response.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * How often, in seconds, the Uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 60s.
     * 
     */
    @Export(name="period", type=String.class, parameters={})
    private Output<String> period;

    /**
     * @return How often, in seconds, the Uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 60s.
     * 
     */
    public Output<String> period() {
        return this.period;
    }
    /**
     * The group resource associated with the configuration.
     * 
     */
    @Export(name="resourceGroup", type=ResourceGroupResponse.class, parameters={})
    private Output<ResourceGroupResponse> resourceGroup;

    /**
     * @return The group resource associated with the configuration.
     * 
     */
    public Output<ResourceGroupResponse> resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions must be provided to include a minimum of 3 locations. Not specifying this field will result in Uptime checks running from all available regions.
     * 
     */
    @Export(name="selectedRegions", type=List.class, parameters={String.class})
    private Output<List<String>> selectedRegions;

    /**
     * @return The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions must be provided to include a minimum of 3 locations. Not specifying this field will result in Uptime checks running from all available regions.
     * 
     */
    public Output<List<String>> selectedRegions() {
        return this.selectedRegions;
    }
    /**
     * Contains information needed to make a TCP check.
     * 
     */
    @Export(name="tcpCheck", type=TcpCheckResponse.class, parameters={})
    private Output<TcpCheckResponse> tcpCheck;

    /**
     * @return Contains information needed to make a TCP check.
     * 
     */
    public Output<TcpCheckResponse> tcpCheck() {
        return this.tcpCheck;
    }
    /**
     * The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Required.
     * 
     */
    @Export(name="timeout", type=String.class, parameters={})
    private Output<String> timeout;

    /**
     * @return The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Required.
     * 
     */
    public Output<String> timeout() {
        return this.timeout;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UptimeCheckConfig(String name) {
        this(name, UptimeCheckConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UptimeCheckConfig(String name, @Nullable UptimeCheckConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UptimeCheckConfig(String name, @Nullable UptimeCheckConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:monitoring/v3:UptimeCheckConfig", name, args == null ? UptimeCheckConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UptimeCheckConfig(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:monitoring/v3:UptimeCheckConfig", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static UptimeCheckConfig get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UptimeCheckConfig(name, id, options);
    }
}
