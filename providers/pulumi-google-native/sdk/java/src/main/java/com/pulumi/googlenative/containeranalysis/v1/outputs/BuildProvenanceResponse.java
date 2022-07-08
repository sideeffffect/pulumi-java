// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis.v1.outputs.ArtifactResponse;
import com.pulumi.googlenative.containeranalysis.v1.outputs.CommandResponse;
import com.pulumi.googlenative.containeranalysis.v1.outputs.SourceResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class BuildProvenanceResponse {
    /**
     * @return Special options applied to this build. This is a catch-all field where build providers can enter any desired additional details.
     * 
     */
    private final Map<String,String> buildOptions;
    /**
     * @return Version string of the builder at the time this build was executed.
     * 
     */
    private final String builderVersion;
    /**
     * @return Output of the build.
     * 
     */
    private final List<ArtifactResponse> builtArtifacts;
    /**
     * @return Commands requested by the build.
     * 
     */
    private final List<CommandResponse> commands;
    /**
     * @return Time at which the build was created.
     * 
     */
    private final String createTime;
    /**
     * @return E-mail address of the user who initiated this build. Note that this was the user&#39;s e-mail address at the time the build was initiated; this address may not represent the same end-user for all time.
     * 
     */
    private final String creator;
    /**
     * @return Time at which execution of the build was finished.
     * 
     */
    private final String endTime;
    /**
     * @return URI where any logs for this provenance were written.
     * 
     */
    private final String logsUri;
    /**
     * @return ID of the project.
     * 
     */
    private final String project;
    /**
     * @return Details of the Source input to the build.
     * 
     */
    private final SourceResponse sourceProvenance;
    /**
     * @return Time at which execution of the build was started.
     * 
     */
    private final String startTime;
    /**
     * @return Trigger identifier if the build was triggered automatically; empty if not.
     * 
     */
    private final String triggerId;

    @CustomType.Constructor
    private BuildProvenanceResponse(
        @CustomType.Parameter("buildOptions") Map<String,String> buildOptions,
        @CustomType.Parameter("builderVersion") String builderVersion,
        @CustomType.Parameter("builtArtifacts") List<ArtifactResponse> builtArtifacts,
        @CustomType.Parameter("commands") List<CommandResponse> commands,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("creator") String creator,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("logsUri") String logsUri,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("sourceProvenance") SourceResponse sourceProvenance,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("triggerId") String triggerId) {
        this.buildOptions = buildOptions;
        this.builderVersion = builderVersion;
        this.builtArtifacts = builtArtifacts;
        this.commands = commands;
        this.createTime = createTime;
        this.creator = creator;
        this.endTime = endTime;
        this.logsUri = logsUri;
        this.project = project;
        this.sourceProvenance = sourceProvenance;
        this.startTime = startTime;
        this.triggerId = triggerId;
    }

    /**
     * @return Special options applied to this build. This is a catch-all field where build providers can enter any desired additional details.
     * 
     */
    public Map<String,String> buildOptions() {
        return this.buildOptions;
    }
    /**
     * @return Version string of the builder at the time this build was executed.
     * 
     */
    public String builderVersion() {
        return this.builderVersion;
    }
    /**
     * @return Output of the build.
     * 
     */
    public List<ArtifactResponse> builtArtifacts() {
        return this.builtArtifacts;
    }
    /**
     * @return Commands requested by the build.
     * 
     */
    public List<CommandResponse> commands() {
        return this.commands;
    }
    /**
     * @return Time at which the build was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return E-mail address of the user who initiated this build. Note that this was the user&#39;s e-mail address at the time the build was initiated; this address may not represent the same end-user for all time.
     * 
     */
    public String creator() {
        return this.creator;
    }
    /**
     * @return Time at which execution of the build was finished.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return URI where any logs for this provenance were written.
     * 
     */
    public String logsUri() {
        return this.logsUri;
    }
    /**
     * @return ID of the project.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return Details of the Source input to the build.
     * 
     */
    public SourceResponse sourceProvenance() {
        return this.sourceProvenance;
    }
    /**
     * @return Time at which execution of the build was started.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return Trigger identifier if the build was triggered automatically; empty if not.
     * 
     */
    public String triggerId() {
        return this.triggerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildProvenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> buildOptions;
        private String builderVersion;
        private List<ArtifactResponse> builtArtifacts;
        private List<CommandResponse> commands;
        private String createTime;
        private String creator;
        private String endTime;
        private String logsUri;
        private String project;
        private SourceResponse sourceProvenance;
        private String startTime;
        private String triggerId;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildProvenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildOptions = defaults.buildOptions;
    	      this.builderVersion = defaults.builderVersion;
    	      this.builtArtifacts = defaults.builtArtifacts;
    	      this.commands = defaults.commands;
    	      this.createTime = defaults.createTime;
    	      this.creator = defaults.creator;
    	      this.endTime = defaults.endTime;
    	      this.logsUri = defaults.logsUri;
    	      this.project = defaults.project;
    	      this.sourceProvenance = defaults.sourceProvenance;
    	      this.startTime = defaults.startTime;
    	      this.triggerId = defaults.triggerId;
        }

        public Builder buildOptions(Map<String,String> buildOptions) {
            this.buildOptions = Objects.requireNonNull(buildOptions);
            return this;
        }
        public Builder builderVersion(String builderVersion) {
            this.builderVersion = Objects.requireNonNull(builderVersion);
            return this;
        }
        public Builder builtArtifacts(List<ArtifactResponse> builtArtifacts) {
            this.builtArtifacts = Objects.requireNonNull(builtArtifacts);
            return this;
        }
        public Builder builtArtifacts(ArtifactResponse... builtArtifacts) {
            return builtArtifacts(List.of(builtArtifacts));
        }
        public Builder commands(List<CommandResponse> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }
        public Builder commands(CommandResponse... commands) {
            return commands(List.of(commands));
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder creator(String creator) {
            this.creator = Objects.requireNonNull(creator);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder logsUri(String logsUri) {
            this.logsUri = Objects.requireNonNull(logsUri);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder sourceProvenance(SourceResponse sourceProvenance) {
            this.sourceProvenance = Objects.requireNonNull(sourceProvenance);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder triggerId(String triggerId) {
            this.triggerId = Objects.requireNonNull(triggerId);
            return this;
        }        public BuildProvenanceResponse build() {
            return new BuildProvenanceResponse(buildOptions, builderVersion, builtArtifacts, commands, createTime, creator, endTime, logsUri, project, sourceProvenance, startTime, triggerId);
        }
    }
}
