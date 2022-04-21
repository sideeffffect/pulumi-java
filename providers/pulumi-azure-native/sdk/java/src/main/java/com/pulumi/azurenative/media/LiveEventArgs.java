// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media;

import com.pulumi.azurenative.media.enums.StreamOptionsFlag;
import com.pulumi.azurenative.media.inputs.CrossSiteAccessPoliciesArgs;
import com.pulumi.azurenative.media.inputs.LiveEventEncodingArgs;
import com.pulumi.azurenative.media.inputs.LiveEventInputArgs;
import com.pulumi.azurenative.media.inputs.LiveEventPreviewArgs;
import com.pulumi.azurenative.media.inputs.LiveEventTranscriptionArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LiveEventArgs extends com.pulumi.resources.ResourceArgs {

    public static final LiveEventArgs Empty = new LiveEventArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The flag indicates if the resource should be automatically started on creation.
     * 
     */
    @Import(name="autoStart")
    private @Nullable Output<Boolean> autoStart;

    public Optional<Output<Boolean>> autoStart() {
        return Optional.ofNullable(this.autoStart);
    }

    /**
     * Live event cross site access policies.
     * 
     */
    @Import(name="crossSiteAccessPolicies")
    private @Nullable Output<CrossSiteAccessPoliciesArgs> crossSiteAccessPolicies;

    public Optional<Output<CrossSiteAccessPoliciesArgs>> crossSiteAccessPolicies() {
        return Optional.ofNullable(this.crossSiteAccessPolicies);
    }

    /**
     * A description for the live event.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Encoding settings for the live event. It configures whether a live encoder is used for the live event and settings for the live encoder if it is used.
     * 
     */
    @Import(name="encoding")
    private @Nullable Output<LiveEventEncodingArgs> encoding;

    public Optional<Output<LiveEventEncodingArgs>> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    /**
     * When useStaticHostname is set to true, the hostnamePrefix specifies the first part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a combination of this prefix, the media service account name and a short code for the Azure Media Services data center.
     * 
     */
    @Import(name="hostnamePrefix")
    private @Nullable Output<String> hostnamePrefix;

    public Optional<Output<String>> hostnamePrefix() {
        return Optional.ofNullable(this.hostnamePrefix);
    }

    /**
     * Live event input settings. It defines how the live event receives input from a contribution encoder.
     * 
     */
    @Import(name="input", required=true)
    private Output<LiveEventInputArgs> input;

    public Output<LiveEventInputArgs> input() {
        return this.input;
    }

    /**
     * The name of the live event, maximum length is 32.
     * 
     */
    @Import(name="liveEventName")
    private @Nullable Output<String> liveEventName;

    public Optional<Output<String>> liveEventName() {
        return Optional.ofNullable(this.liveEventName);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Live event preview settings. Preview allows live event producers to preview the live streaming content without creating any live output.
     * 
     */
    @Import(name="preview")
    private @Nullable Output<LiveEventPreviewArgs> preview;

    public Optional<Output<LiveEventPreviewArgs>> preview() {
        return Optional.ofNullable(this.preview);
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The options to use for the LiveEvent. This value is specified at creation time and cannot be updated. The valid values for the array entry values are &#39;Default&#39; and &#39;LowLatency&#39;.
     * 
     */
    @Import(name="streamOptions")
    private @Nullable Output<List<Either<String,StreamOptionsFlag>>> streamOptions;

    public Optional<Output<List<Either<String,StreamOptionsFlag>>>> streamOptions() {
        return Optional.ofNullable(this.streamOptions);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Live transcription settings for the live event. See https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription feature.
     * 
     */
    @Import(name="transcriptions")
    private @Nullable Output<List<LiveEventTranscriptionArgs>> transcriptions;

    public Optional<Output<List<LiveEventTranscriptionArgs>>> transcriptions() {
        return Optional.ofNullable(this.transcriptions);
    }

    /**
     * Specifies whether a static hostname would be assigned to the live event preview and ingest endpoints. This value can only be updated if the live event is in Standby state
     * 
     */
    @Import(name="useStaticHostname")
    private @Nullable Output<Boolean> useStaticHostname;

    public Optional<Output<Boolean>> useStaticHostname() {
        return Optional.ofNullable(this.useStaticHostname);
    }

    private LiveEventArgs() {}

    private LiveEventArgs(LiveEventArgs $) {
        this.accountName = $.accountName;
        this.autoStart = $.autoStart;
        this.crossSiteAccessPolicies = $.crossSiteAccessPolicies;
        this.description = $.description;
        this.encoding = $.encoding;
        this.hostnamePrefix = $.hostnamePrefix;
        this.input = $.input;
        this.liveEventName = $.liveEventName;
        this.location = $.location;
        this.preview = $.preview;
        this.resourceGroupName = $.resourceGroupName;
        this.streamOptions = $.streamOptions;
        this.tags = $.tags;
        this.transcriptions = $.transcriptions;
        this.useStaticHostname = $.useStaticHostname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LiveEventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LiveEventArgs $;

        public Builder() {
            $ = new LiveEventArgs();
        }

        public Builder(LiveEventArgs defaults) {
            $ = new LiveEventArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder autoStart(@Nullable Output<Boolean> autoStart) {
            $.autoStart = autoStart;
            return this;
        }

        public Builder autoStart(Boolean autoStart) {
            return autoStart(Output.of(autoStart));
        }

        public Builder crossSiteAccessPolicies(@Nullable Output<CrossSiteAccessPoliciesArgs> crossSiteAccessPolicies) {
            $.crossSiteAccessPolicies = crossSiteAccessPolicies;
            return this;
        }

        public Builder crossSiteAccessPolicies(CrossSiteAccessPoliciesArgs crossSiteAccessPolicies) {
            return crossSiteAccessPolicies(Output.of(crossSiteAccessPolicies));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder encoding(@Nullable Output<LiveEventEncodingArgs> encoding) {
            $.encoding = encoding;
            return this;
        }

        public Builder encoding(LiveEventEncodingArgs encoding) {
            return encoding(Output.of(encoding));
        }

        public Builder hostnamePrefix(@Nullable Output<String> hostnamePrefix) {
            $.hostnamePrefix = hostnamePrefix;
            return this;
        }

        public Builder hostnamePrefix(String hostnamePrefix) {
            return hostnamePrefix(Output.of(hostnamePrefix));
        }

        public Builder input(Output<LiveEventInputArgs> input) {
            $.input = input;
            return this;
        }

        public Builder input(LiveEventInputArgs input) {
            return input(Output.of(input));
        }

        public Builder liveEventName(@Nullable Output<String> liveEventName) {
            $.liveEventName = liveEventName;
            return this;
        }

        public Builder liveEventName(String liveEventName) {
            return liveEventName(Output.of(liveEventName));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder preview(@Nullable Output<LiveEventPreviewArgs> preview) {
            $.preview = preview;
            return this;
        }

        public Builder preview(LiveEventPreviewArgs preview) {
            return preview(Output.of(preview));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder streamOptions(@Nullable Output<List<Either<String,StreamOptionsFlag>>> streamOptions) {
            $.streamOptions = streamOptions;
            return this;
        }

        public Builder streamOptions(List<Either<String,StreamOptionsFlag>> streamOptions) {
            return streamOptions(Output.of(streamOptions));
        }

        public Builder streamOptions(Either<String,StreamOptionsFlag>... streamOptions) {
            return streamOptions(List.of(streamOptions));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder transcriptions(@Nullable Output<List<LiveEventTranscriptionArgs>> transcriptions) {
            $.transcriptions = transcriptions;
            return this;
        }

        public Builder transcriptions(List<LiveEventTranscriptionArgs> transcriptions) {
            return transcriptions(Output.of(transcriptions));
        }

        public Builder transcriptions(LiveEventTranscriptionArgs... transcriptions) {
            return transcriptions(List.of(transcriptions));
        }

        public Builder useStaticHostname(@Nullable Output<Boolean> useStaticHostname) {
            $.useStaticHostname = useStaticHostname;
            return this;
        }

        public Builder useStaticHostname(Boolean useStaticHostname) {
            return useStaticHostname(Output.of(useStaticHostname));
        }

        public LiveEventArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.input = Objects.requireNonNull($.input, "expected parameter 'input' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
