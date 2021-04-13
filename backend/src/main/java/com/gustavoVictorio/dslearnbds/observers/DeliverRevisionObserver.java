package com.gustavoVictorio.dslearnbds.observers;

import com.gustavoVictorio.dslearnbds.entities.Deliver;

public interface DeliverRevisionObserver {

	void onSaveRevision(Deliver deliver);

}
