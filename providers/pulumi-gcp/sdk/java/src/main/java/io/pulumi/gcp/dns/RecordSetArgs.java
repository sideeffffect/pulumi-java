// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecordSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecordSetArgs Empty = new RecordSetArgs();

    /**
     * The name of the zone in which this record set will
     * reside.
     * 
     */
    @InputImport(name="managedZone", required=true)
      private final Input<String> managedZone;

    public Input<String> getManagedZone() {
        return this.managedZone;
    }

    /**
     * The DNS name this record set will apply to.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The string data for the records in this record set whose meaning depends on the DNS type. For TXT record, if the string
     * data contains spaces, add surrounding \" if you don't want your string to get split on spaces. To specify a single
     * record value longer than 255 characters such as a TXT record for DKIM, add \"\" inside the Terraform configuration
     * string (e.g. "first255characters\"\"morecharacters").
     * 
     */
    @InputImport(name="rrdatas", required=true)
      private final Input<List<String>> rrdatas;

    public Input<List<String>> getRrdatas() {
        return this.rrdatas;
    }

    /**
     * The time-to-live of this record set (seconds).
     * 
     */
    @InputImport(name="ttl")
      private final @Nullable Input<Integer> ttl;

    public Input<Integer> getTtl() {
        return this.ttl == null ? Input.empty() : this.ttl;
    }

    /**
     * The DNS record set type.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public RecordSetArgs(
        Input<String> managedZone,
        Input<String> name,
        @Nullable Input<String> project,
        Input<List<String>> rrdatas,
        @Nullable Input<Integer> ttl,
        Input<String> type) {
        this.managedZone = Objects.requireNonNull(managedZone, "expected parameter 'managedZone' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.project = project;
        this.rrdatas = Objects.requireNonNull(rrdatas, "expected parameter 'rrdatas' to be non-null");
        this.ttl = ttl;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RecordSetArgs() {
        this.managedZone = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.rrdatas = Input.empty();
        this.ttl = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> managedZone;
        private Input<String> name;
        private @Nullable Input<String> project;
        private Input<List<String>> rrdatas;
        private @Nullable Input<Integer> ttl;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedZone = defaults.managedZone;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.rrdatas = defaults.rrdatas;
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
        }

        public Builder managedZone(Input<String> managedZone) {
            this.managedZone = Objects.requireNonNull(managedZone);
            return this;
        }

        public Builder managedZone(String managedZone) {
            this.managedZone = Input.of(Objects.requireNonNull(managedZone));
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder rrdatas(Input<List<String>> rrdatas) {
            this.rrdatas = Objects.requireNonNull(rrdatas);
            return this;
        }

        public Builder rrdatas(List<String> rrdatas) {
            this.rrdatas = Input.of(Objects.requireNonNull(rrdatas));
            return this;
        }

        public Builder ttl(@Nullable Input<Integer> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder ttl(@Nullable Integer ttl) {
            this.ttl = Input.ofNullable(ttl);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public RecordSetArgs build() {
            return new RecordSetArgs(managedZone, name, project, rrdatas, ttl, type);
        }
    }
}
