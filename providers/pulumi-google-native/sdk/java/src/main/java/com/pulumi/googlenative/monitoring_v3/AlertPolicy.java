// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.monitoring_v3.AlertPolicyArgs;
import com.pulumi.googlenative.monitoring_v3.outputs.AlertStrategyResponse;
import com.pulumi.googlenative.monitoring_v3.outputs.ConditionResponse;
import com.pulumi.googlenative.monitoring_v3.outputs.DocumentationResponse;
import com.pulumi.googlenative.monitoring_v3.outputs.MutationRecordResponse;
import com.pulumi.googlenative.monitoring_v3.outputs.StatusResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new alerting policy.
 * 
 */
@ResourceType(type="google-native:monitoring/v3:AlertPolicy")
public class AlertPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Control over how this alert policy's notification channels are notified.
     * 
     */
    @Export(name="alertStrategy", type=AlertStrategyResponse.class, parameters={})
    private Output<AlertStrategyResponse> alertStrategy;

    /**
     * @return Control over how this alert policy's notification channels are notified.
     * 
     */
    public Output<AlertStrategyResponse> alertStrategy() {
        return this.alertStrategy;
    }
    /**
     * How to combine the results of multiple conditions to determine if an incident should be opened. If condition_time_series_query_language is present, this must be COMBINE_UNSPECIFIED.
     * 
     */
    @Export(name="combiner", type=String.class, parameters={})
    private Output<String> combiner;

    /**
     * @return How to combine the results of multiple conditions to determine if an incident should be opened. If condition_time_series_query_language is present, this must be COMBINE_UNSPECIFIED.
     * 
     */
    public Output<String> combiner() {
        return this.combiner;
    }
    /**
     * A list of conditions for the policy. The conditions are combined by AND or OR according to the combiner field. If the combined conditions evaluate to true, then an incident is created. A policy can have from one to six conditions. If condition_time_series_query_language is present, it must be the only condition.
     * 
     */
    @Export(name="conditions", type=List.class, parameters={ConditionResponse.class})
    private Output<List<ConditionResponse>> conditions;

    /**
     * @return A list of conditions for the policy. The conditions are combined by AND or OR according to the combiner field. If the combined conditions evaluate to true, then an incident is created. A policy can have from one to six conditions. If condition_time_series_query_language is present, it must be the only condition.
     * 
     */
    public Output<List<ConditionResponse>> conditions() {
        return this.conditions;
    }
    /**
     * A read-only record of the creation of the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    @Export(name="creationRecord", type=MutationRecordResponse.class, parameters={})
    private Output<MutationRecordResponse> creationRecord;

    /**
     * @return A read-only record of the creation of the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    public Output<MutationRecordResponse> creationRecord() {
        return this.creationRecord;
    }
    /**
     * A short name or phrase used to identify the policy in dashboards, notifications, and incidents. To avoid confusion, don't use the same display name for multiple policies in the same project. The name is limited to 512 Unicode characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A short name or phrase used to identify the policy in dashboards, notifications, and incidents. To avoid confusion, don't use the same display name for multiple policies in the same project. The name is limited to 512 Unicode characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Documentation that is included with notifications and incidents related to this policy. Best practice is for the documentation to include information to help responders understand, mitigate, escalate, and correct the underlying problems detected by the alerting policy. Notification channels that have limited capacity might not show this documentation.
     * 
     */
    @Export(name="documentation", type=DocumentationResponse.class, parameters={})
    private Output<DocumentationResponse> documentation;

    /**
     * @return Documentation that is included with notifications and incidents related to this policy. Best practice is for the documentation to include information to help responders understand, mitigate, escalate, and correct the underlying problems detected by the alerting policy. Notification channels that have limited capacity might not show this documentation.
     * 
     */
    public Output<DocumentationResponse> documentation() {
        return this.documentation;
    }
    /**
     * Whether or not the policy is enabled. On write, the default interpretation if unset is that the policy is enabled. On read, clients should not make any assumption about the state if it has not been populated. The field should always be populated on List and Get operations, unless a field projection has been specified that strips it out.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Whether or not the policy is enabled. On write, the default interpretation if unset is that the policy is enabled. On read, clients should not make any assumption about the state if it has not been populated. The field should always be populated on List and Get operations, unless a field projection has been specified that strips it out.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * A read-only record of the most recent change to the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    @Export(name="mutationRecord", type=MutationRecordResponse.class, parameters={})
    private Output<MutationRecordResponse> mutationRecord;

    /**
     * @return A read-only record of the most recent change to the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    public Output<MutationRecordResponse> mutationRecord() {
        return this.mutationRecord;
    }
    /**
     * Required if the policy exists. The resource name for this policy. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID] [ALERT_POLICY_ID] is assigned by Stackdriver Monitoring when the policy is created. When calling the alertPolicies.create method, do not include the name field in the alerting policy passed as part of the request.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Required if the policy exists. The resource name for this policy. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID] [ALERT_POLICY_ID] is assigned by Stackdriver Monitoring when the policy is created. When calling the alertPolicies.create method, do not include the name field in the alerting policy passed as part of the request.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Identifies the notification channels to which notifications should be sent when incidents are opened or closed or when new violations occur on an already opened incident. Each element of this array corresponds to the name field in each of the NotificationChannel objects that are returned from the ListNotificationChannels method. The format of the entries in this field is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
     * 
     */
    @Export(name="notificationChannels", type=List.class, parameters={String.class})
    private Output<List<String>> notificationChannels;

    /**
     * @return Identifies the notification channels to which notifications should be sent when incidents are opened or closed or when new violations occur on an already opened incident. Each element of this array corresponds to the name field in each of the NotificationChannel objects that are returned from the ListNotificationChannels method. The format of the entries in this field is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
     * 
     */
    public Output<List<String>> notificationChannels() {
        return this.notificationChannels;
    }
    /**
     * User-supplied key/value data to be used for organizing and identifying the AlertPolicy objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    @Export(name="userLabels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> userLabels;

    /**
     * @return User-supplied key/value data to be used for organizing and identifying the AlertPolicy objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    public Output<Map<String,String>> userLabels() {
        return this.userLabels;
    }
    /**
     * Read-only description of how the alert policy is invalid. OK if the alert policy is valid. If not OK, the alert policy will not generate incidents.
     * 
     */
    @Export(name="validity", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> validity;

    /**
     * @return Read-only description of how the alert policy is invalid. OK if the alert policy is valid. If not OK, the alert policy will not generate incidents.
     * 
     */
    public Output<StatusResponse> validity() {
        return this.validity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AlertPolicy(String name) {
        this(name, AlertPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlertPolicy(String name, @Nullable AlertPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlertPolicy(String name, @Nullable AlertPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:monitoring/v3:AlertPolicy", name, args == null ? AlertPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AlertPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:monitoring/v3:AlertPolicy", name, null, makeResourceOptions(options, id));
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
    public static AlertPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AlertPolicy(name, id, options);
    }
}
