// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Select audio tracks from the input by specifying an attribute and an attribute filter.
 * 
 */
public final class SelectAudioTrackByAttributeResponse extends io.pulumi.resources.InvokeArgs {

    public static final SelectAudioTrackByAttributeResponse Empty = new SelectAudioTrackByAttributeResponse();

    /**
     * The TrackAttribute to filter the tracks by.
     * 
     */
    @InputImport(name="attribute", required=true)
      private final String attribute;

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * Optional designation for single channel audio tracks.  Can be used to combine the tracks into stereo or multi-channel audio tracks.
     * 
     */
    @InputImport(name="channelMapping")
      private final @Nullable String channelMapping;

    public Optional<String> getChannelMapping() {
        return this.channelMapping == null ? Optional.empty() : Optional.ofNullable(this.channelMapping);
    }

    /**
     * The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
     */
    @InputImport(name="filter", required=true)
      private final String filter;

    public String getFilter() {
        return this.filter;
    }

    /**
     * The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property.
     * 
     */
    @InputImport(name="filterValue")
      private final @Nullable String filterValue;

    public Optional<String> getFilterValue() {
        return this.filterValue == null ? Optional.empty() : Optional.ofNullable(this.filterValue);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectAudioTrackByAttribute'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public SelectAudioTrackByAttributeResponse(
        String attribute,
        @Nullable String channelMapping,
        String filter,
        @Nullable String filterValue,
        String odataType) {
        this.attribute = Objects.requireNonNull(attribute, "expected parameter 'attribute' to be non-null");
        this.channelMapping = channelMapping;
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.filterValue = filterValue;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private SelectAudioTrackByAttributeResponse() {
        this.attribute = null;
        this.channelMapping = null;
        this.filter = null;
        this.filterValue = null;
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectAudioTrackByAttributeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attribute;
        private @Nullable String channelMapping;
        private String filter;
        private @Nullable String filterValue;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectAudioTrackByAttributeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.channelMapping = defaults.channelMapping;
    	      this.filter = defaults.filter;
    	      this.filterValue = defaults.filterValue;
    	      this.odataType = defaults.odataType;
        }

        public Builder attribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }

        public Builder channelMapping(@Nullable String channelMapping) {
            this.channelMapping = channelMapping;
            return this;
        }

        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder filterValue(@Nullable String filterValue) {
            this.filterValue = filterValue;
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public SelectAudioTrackByAttributeResponse build() {
            return new SelectAudioTrackByAttributeResponse(attribute, channelMapping, filter, filterValue, odataType);
        }
    }
}
