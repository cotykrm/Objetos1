package ar.edu.unlp.info.oo1.ejercicio12;

public class JobSchedulerLIFO extends JobScheduler{
    public JobSchedulerLIFO (){
        super();
    }

    public JobDescription next(){
        JobDescription nextJob = null;
        nextJob = jobs.get(jobs.size()-1);
        this.unschedule(nextJob);
        return nextJob;
    }

}
