// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.azurenative.eventhub.inputs.DestinationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties to configure capture description for eventhub
 * 
 */
public final class CaptureDescriptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final CaptureDescriptionResponse Empty = new CaptureDescriptionResponse();

    /**
     * Properties of Destination where capture will be stored. (Storage Account, Blob Names)
     * 
     */
    @Import(name="destination")
    private @Nullable DestinationResponse destination;

    public Optional<DestinationResponse> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * A value that indicates whether capture description is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Enumerates the possible values for the encoding format of capture description. Note: &#39;AvroDeflate&#39; will be deprecated in New API Version
     * 
     */
    @Import(name="encoding")
    private @Nullable String encoding;

    public Optional<String> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    /**
     * The time window allows you to set the frequency with which the capture to Azure Blobs will happen, value should between 60 to 900 seconds
     * 
     */
    @Import(name="intervalInSeconds")
    private @Nullable Integer intervalInSeconds;

    public Optional<Integer> intervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }

    /**
     * The size window defines the amount of data built up in your Event Hub before an capture operation, value should be between 10485760 to 524288000 bytes
     * 
     */
    @Import(name="sizeLimitInBytes")
    private @Nullable Integer sizeLimitInBytes;

    public Optional<Integer> sizeLimitInBytes() {
        return Optional.ofNullable(this.sizeLimitInBytes);
    }

    /**
     * A value that indicates whether to Skip Empty Archives
     * 
     */
    @Import(name="skipEmptyArchives")
    private @Nullable Boolean skipEmptyArchives;

    public Optional<Boolean> skipEmptyArchives() {
        return Optional.ofNullable(this.skipEmptyArchives);
    }

    private CaptureDescriptionResponse() {}

    private CaptureDescriptionResponse(CaptureDescriptionResponse $) {
        this.destination = $.destination;
        this.enabled = $.enabled;
        this.encoding = $.encoding;
        this.intervalInSeconds = $.intervalInSeconds;
        this.sizeLimitInBytes = $.sizeLimitInBytes;
        this.skipEmptyArchives = $.skipEmptyArchives;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CaptureDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CaptureDescriptionResponse $;

        public Builder() {
            $ = new CaptureDescriptionResponse();
        }

        public Builder(CaptureDescriptionResponse defaults) {
            $ = new CaptureDescriptionResponse(Objects.requireNonNull(defaults));
        }

        public Builder destination(@Nullable DestinationResponse destination) {
            $.destination = destination;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder encoding(@Nullable String encoding) {
            $.encoding = encoding;
            return this;
        }

        public Builder intervalInSeconds(@Nullable Integer intervalInSeconds) {
            $.intervalInSeconds = intervalInSeconds;
            return this;
        }

        public Builder sizeLimitInBytes(@Nullable Integer sizeLimitInBytes) {
            $.sizeLimitInBytes = sizeLimitInBytes;
            return this;
        }

        public Builder skipEmptyArchives(@Nullable Boolean skipEmptyArchives) {
            $.skipEmptyArchives = skipEmptyArchives;
            return this;
        }

        public CaptureDescriptionResponse build() {
            return $;
        }
    }

}
