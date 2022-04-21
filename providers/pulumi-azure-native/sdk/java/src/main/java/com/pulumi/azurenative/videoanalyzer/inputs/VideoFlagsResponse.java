// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Video flags contain information about the available video actions and its dynamic properties based on the current video state.
 * 
 */
public final class VideoFlagsResponse extends com.pulumi.resources.InvokeArgs {

    public static final VideoFlagsResponse Empty = new VideoFlagsResponse();

    /**
     * Value indicating whether or not the video can be streamed. Only &#34;archive&#34; type videos can be streamed.
     * 
     */
    @Import(name="canStream", required=true)
    private Boolean canStream;

    public Boolean canStream() {
        return this.canStream;
    }

    /**
     * Value indicating whether or not there has ever been data recorded or uploaded into the video. Newly created videos have this value set to false.
     * 
     */
    @Import(name="hasData", required=true)
    private Boolean hasData;

    public Boolean hasData() {
        return this.hasData;
    }

    /**
     * Value indicating whether or not the video is currently being referenced be an active live pipeline. The fact that is being referenced, doesn&#39;t necessarily indicate that data is being received. For example, video recording may be gated on events or camera may not be accessible at the time.
     * 
     */
    @Import(name="isRecording", required=true)
    private Boolean isRecording;

    public Boolean isRecording() {
        return this.isRecording;
    }

    private VideoFlagsResponse() {}

    private VideoFlagsResponse(VideoFlagsResponse $) {
        this.canStream = $.canStream;
        this.hasData = $.hasData;
        this.isRecording = $.isRecording;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VideoFlagsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VideoFlagsResponse $;

        public Builder() {
            $ = new VideoFlagsResponse();
        }

        public Builder(VideoFlagsResponse defaults) {
            $ = new VideoFlagsResponse(Objects.requireNonNull(defaults));
        }

        public Builder canStream(Boolean canStream) {
            $.canStream = canStream;
            return this;
        }

        public Builder hasData(Boolean hasData) {
            $.hasData = hasData;
            return this;
        }

        public Builder isRecording(Boolean isRecording) {
            $.isRecording = isRecording;
            return this;
        }

        public VideoFlagsResponse build() {
            $.canStream = Objects.requireNonNull($.canStream, "expected parameter 'canStream' to be non-null");
            $.hasData = Objects.requireNonNull($.hasData, "expected parameter 'hasData' to be non-null");
            $.isRecording = Objects.requireNonNull($.isRecording, "expected parameter 'isRecording' to be non-null");
            return $;
        }
    }

}
