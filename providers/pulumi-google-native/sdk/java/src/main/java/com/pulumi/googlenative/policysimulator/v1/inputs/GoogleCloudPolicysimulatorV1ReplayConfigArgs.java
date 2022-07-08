// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.policysimulator.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.policysimulator.v1.enums.GoogleCloudPolicysimulatorV1ReplayConfigLogSource;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration used for a Replay.
 * 
 */
public final class GoogleCloudPolicysimulatorV1ReplayConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudPolicysimulatorV1ReplayConfigArgs Empty = new GoogleCloudPolicysimulatorV1ReplayConfigArgs();

    /**
     * The logs to use as input for the Replay.
     * 
     */
    @Import(name="logSource")
    private @Nullable Output<GoogleCloudPolicysimulatorV1ReplayConfigLogSource> logSource;

    /**
     * @return The logs to use as input for the Replay.
     * 
     */
    public Optional<Output<GoogleCloudPolicysimulatorV1ReplayConfigLogSource>> logSource() {
        return Optional.ofNullable(this.logSource);
    }

    /**
     * A mapping of the resources that you want to simulate policies for and the policies that you want to simulate. Keys are the full resource names for the resources. For example, `//cloudresourcemanager.googleapis.com/projects/my-project`. For examples of full resource names for Google Cloud services, see https://cloud.google.com/iam/help/troubleshooter/full-resource-names. Values are Policy objects representing the policies that you want to simulate. Replays automatically take into account any IAM policies inherited through the resource hierarchy, and any policies set on descendant resources. You do not need to include these policies in the policy overlay.
     * 
     */
    @Import(name="policyOverlay")
    private @Nullable Output<Map<String,String>> policyOverlay;

    /**
     * @return A mapping of the resources that you want to simulate policies for and the policies that you want to simulate. Keys are the full resource names for the resources. For example, `//cloudresourcemanager.googleapis.com/projects/my-project`. For examples of full resource names for Google Cloud services, see https://cloud.google.com/iam/help/troubleshooter/full-resource-names. Values are Policy objects representing the policies that you want to simulate. Replays automatically take into account any IAM policies inherited through the resource hierarchy, and any policies set on descendant resources. You do not need to include these policies in the policy overlay.
     * 
     */
    public Optional<Output<Map<String,String>>> policyOverlay() {
        return Optional.ofNullable(this.policyOverlay);
    }

    private GoogleCloudPolicysimulatorV1ReplayConfigArgs() {}

    private GoogleCloudPolicysimulatorV1ReplayConfigArgs(GoogleCloudPolicysimulatorV1ReplayConfigArgs $) {
        this.logSource = $.logSource;
        this.policyOverlay = $.policyOverlay;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudPolicysimulatorV1ReplayConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudPolicysimulatorV1ReplayConfigArgs $;

        public Builder() {
            $ = new GoogleCloudPolicysimulatorV1ReplayConfigArgs();
        }

        public Builder(GoogleCloudPolicysimulatorV1ReplayConfigArgs defaults) {
            $ = new GoogleCloudPolicysimulatorV1ReplayConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logSource The logs to use as input for the Replay.
         * 
         * @return builder
         * 
         */
        public Builder logSource(@Nullable Output<GoogleCloudPolicysimulatorV1ReplayConfigLogSource> logSource) {
            $.logSource = logSource;
            return this;
        }

        /**
         * @param logSource The logs to use as input for the Replay.
         * 
         * @return builder
         * 
         */
        public Builder logSource(GoogleCloudPolicysimulatorV1ReplayConfigLogSource logSource) {
            return logSource(Output.of(logSource));
        }

        /**
         * @param policyOverlay A mapping of the resources that you want to simulate policies for and the policies that you want to simulate. Keys are the full resource names for the resources. For example, `//cloudresourcemanager.googleapis.com/projects/my-project`. For examples of full resource names for Google Cloud services, see https://cloud.google.com/iam/help/troubleshooter/full-resource-names. Values are Policy objects representing the policies that you want to simulate. Replays automatically take into account any IAM policies inherited through the resource hierarchy, and any policies set on descendant resources. You do not need to include these policies in the policy overlay.
         * 
         * @return builder
         * 
         */
        public Builder policyOverlay(@Nullable Output<Map<String,String>> policyOverlay) {
            $.policyOverlay = policyOverlay;
            return this;
        }

        /**
         * @param policyOverlay A mapping of the resources that you want to simulate policies for and the policies that you want to simulate. Keys are the full resource names for the resources. For example, `//cloudresourcemanager.googleapis.com/projects/my-project`. For examples of full resource names for Google Cloud services, see https://cloud.google.com/iam/help/troubleshooter/full-resource-names. Values are Policy objects representing the policies that you want to simulate. Replays automatically take into account any IAM policies inherited through the resource hierarchy, and any policies set on descendant resources. You do not need to include these policies in the policy overlay.
         * 
         * @return builder
         * 
         */
        public Builder policyOverlay(Map<String,String> policyOverlay) {
            return policyOverlay(Output.of(policyOverlay));
        }

        public GoogleCloudPolicysimulatorV1ReplayConfigArgs build() {
            return $;
        }
    }

}
