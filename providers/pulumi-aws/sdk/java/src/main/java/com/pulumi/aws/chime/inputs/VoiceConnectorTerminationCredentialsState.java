// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.chime.inputs;

import com.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsCredentialGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VoiceConnectorTerminationCredentialsState extends com.pulumi.resources.ResourceArgs {

    public static final VoiceConnectorTerminationCredentialsState Empty = new VoiceConnectorTerminationCredentialsState();

    /**
     * List of termination SIP credentials.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<List<VoiceConnectorTerminationCredentialsCredentialGetArgs>> credentials;

    public Optional<Output<List<VoiceConnectorTerminationCredentialsCredentialGetArgs>>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * Amazon Chime Voice Connector ID.
     * 
     */
    @Import(name="voiceConnectorId")
    private @Nullable Output<String> voiceConnectorId;

    public Optional<Output<String>> voiceConnectorId() {
        return Optional.ofNullable(this.voiceConnectorId);
    }

    private VoiceConnectorTerminationCredentialsState() {}

    private VoiceConnectorTerminationCredentialsState(VoiceConnectorTerminationCredentialsState $) {
        this.credentials = $.credentials;
        this.voiceConnectorId = $.voiceConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VoiceConnectorTerminationCredentialsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VoiceConnectorTerminationCredentialsState $;

        public Builder() {
            $ = new VoiceConnectorTerminationCredentialsState();
        }

        public Builder(VoiceConnectorTerminationCredentialsState defaults) {
            $ = new VoiceConnectorTerminationCredentialsState(Objects.requireNonNull(defaults));
        }

        public Builder credentials(@Nullable Output<List<VoiceConnectorTerminationCredentialsCredentialGetArgs>> credentials) {
            $.credentials = credentials;
            return this;
        }

        public Builder credentials(List<VoiceConnectorTerminationCredentialsCredentialGetArgs> credentials) {
            return credentials(Output.of(credentials));
        }

        public Builder credentials(VoiceConnectorTerminationCredentialsCredentialGetArgs... credentials) {
            return credentials(List.of(credentials));
        }

        public Builder voiceConnectorId(@Nullable Output<String> voiceConnectorId) {
            $.voiceConnectorId = voiceConnectorId;
            return this;
        }

        public Builder voiceConnectorId(String voiceConnectorId) {
            return voiceConnectorId(Output.of(voiceConnectorId));
        }

        public VoiceConnectorTerminationCredentialsState build() {
            return $;
        }
    }

}
